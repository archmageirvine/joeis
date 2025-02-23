package irvine.math.group;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.util.string.Date;
import irvine.util.string.StringUtils;

/**
 * A generator for an element in a parent group.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class Generator<T> extends AbstractGroup<T> {

  private final Group<T> mParent;
  private final Set<T> mElements;
  private final LinkedHashSet<T> mMembers = new LinkedHashSet<>();
  private final T mZero;
  private final boolean mVerbose;

  /**
   * Construct a new subgroup generated by an element in the given group.
   * @param element base element for generator
   * @param parent parent group
   * @throws UnsupportedOperationException if the underlying group is infinite.
   */
  public Generator(final Group<T> parent, final T element) {
    if (parent == null || element == null) {
      throw new NullPointerException();
    }
    // This implementation explicitly computes all the members, so
    // it cannot deal with infinite sets reliably.
    parent.abortOnInfinite();
    mParent = parent;
    mElements = new Singleton<>(element);
    T e = mParent.zero();
    mZero = e;
    mVerbose = false;
    do {
      mMembers.add(e);
      e = mParent.add(element, e);
    } while (!mParent.zero().equals(e));
  }

  private void init() {
    // Lazy computation of members
    if (mMembers.isEmpty()) {
      final LinkedList<T> queue = new LinkedList<>();
      queue.add(mZero);
      mMembers.add(mZero);
      while (!queue.isEmpty()) {
        final T f = queue.pollFirst();
        for (final T e : mElements) {
          final T next = mParent.add(e, f);
          if (mMembers.add(next)) {
            queue.add(next);
            if (mVerbose && (mMembers.size() & 0xFFFF) == 0) {
              System.out.println(Date.now() + "Size: " + mMembers.size());
            }
          }
        }
      }
    }
  }

  /**
   * Construct a new subgroup generated by elements in the given group.
   * @param parent parent group
   * @param elements base elements for generator
   * @param zero particular zero to use
   * @param verbose if true report on the construction process
   * @throws UnsupportedOperationException if the underlying group is infinite.
   */
  public Generator(final Group<T> parent, final Set<T> elements, final T zero, final boolean verbose) {
    if (parent == null || elements == null) {
      throw new NullPointerException();
    }
    // This implementation explicitly computes all the members, so
    // it cannot deal with infinite sets reliably.  In fact, it will
    // overflow if there are more than 2^31 elements.
    parent.abortOnInfinite();
    elements.abortOnInfinite();
    mParent = parent;
    mElements = elements;
    mZero = zero;
    mVerbose = verbose;
  }

  /**
   * Construct a new subgroup generated by elements in the given group.
   * @param parent parent group
   * @param elements base elements for generator
   * @param verbose if true report on the construction process
   * @throws UnsupportedOperationException if the underlying group is infinite.
   */
  public Generator(final Group<T> parent, final Set<T> elements, final boolean verbose) {
    this(parent, elements, parent.zero(), verbose);
  }

  @Override
  public T zero() {
    return mZero;
  }

  @Override
  public Z size() {
    // A more powerful version is in IntegerPermutationGroup that uses Schreier-Sims
    init();
    return Z.valueOf(mMembers.size());
  }

  private Boolean mAbelian = null;
  
  @Override
  public boolean isAbelian() {
    if (mParent.isAbelian()) {
      return true;
    }
    if (mAbelian == null) {
      mAbelian = GroupUtils.isAbelian(this); // expensive test
    }
    return mAbelian;
  }

  @Override
  public boolean contains(final T a) {
    init();
    return mMembers.contains(a);
  }

  @Override
  public T add(final T a, final T b) {
    checkContains(a);
    checkContains(b);
    return mParent.add(a, b);
  }

  @Override
  public T negate(final T a) {
    checkContains(a);
    return mParent.negate(a);
  }

  @Override
  public Iterator<T> iterator() {
    init();
    return mMembers.iterator();
  }

  @Override
  public String toString() {
    return "<" + StringUtils.toString(mElements, ",") + ">";
  }

  /**
   * Return the size of the generating set of this group.  Note this is not
   * guaranteed to be the minimal size, only the size used during construction.
   * @return generating set size
   */
  public Z generatingSetSize() {
    return mElements.size();
  }

  @Override
  public Graph cayleyGraph() {
    final Z size = size();
    if (size == null || size.bitLength() >= Integer.SIZE) {
      return super.cayleyGraph();
    }
    final Graph cayleyGraph = GraphFactory.createDigraph(size.intValueExact());
    final HashMap<T, Integer> nodeMapping = new HashMap<>();
    nodeMapping.put(zero(), 0);
    for (final T element : this) {
      for (final T gen : mElements) {
        final int u = nodeMapping.computeIfAbsent(element, key -> nodeMapping.size());
        final int v = nodeMapping.computeIfAbsent(add(element, gen), key -> nodeMapping.size());
        cayleyGraph.addEdge(u, v);
      }
    }
    return cayleyGraph;
  }
}
