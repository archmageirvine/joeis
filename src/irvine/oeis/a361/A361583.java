package irvine.oeis.a361;

import java.util.Collections;
import java.util.List;
import irvine.math.graph.Edges;
import irvine.math.graph.GraphUtils;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A361583 Number of digraphs on n unlabeled nodes whose strongly connected components are complete digraphs.
 * @author Gregory Morse
 */
public class A361583 extends A361582 {
  private final Edges mComponentType;
  private final boolean mSingletons;
  private int mN = -1;

  /**
   * Construct a restricted component count.
   * @param componentType cycle index weight for the allowed components
   * @param singletons whether singleton components are allowed
   */
  protected A361583(final Edges componentType, final boolean singletons) {
    mComponentType = componentType;
    mSingletons = singletons;
  }

  /** Construct the sequence. */
  public A361583() {
    this(Edges.DIGRAPH_EDGES, true);
  }

  @Override
  protected List<List<Q>> strongComponents(final int n) {
    // A complete component is fixed by every permutation.
    final List<List<Q>> components = GraphUtils.graphCycleIndexData(Rationals.SINGLETON, n, mComponentType, e -> Q.ONE);
    if (!mSingletons && n > 0) {
      components.set(1, Collections.singletonList(Q.ZERO));
    }
    return components;
  }

  @Override
  protected Polynomial<Q> mark(final int n) {
    return RING.one();
  }

  @Override
  public Z next() {
    return row(++mN).coeff(0).toZ();
  }
}
