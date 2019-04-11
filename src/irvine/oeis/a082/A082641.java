package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A082641 Triangle T(n,k) <code>(n &gt;= 1, 1 &lt;= k &lt;= n)</code> read by rows, where T(n,k) = number of basic invariants of degree k for the cyclic group of order and degree n.
 * @author Sean A. Irvine
 */
public class A082641 implements Sequence {

  // Multisets on elements {1,2,...,n} such that sum of elements in a set is 0 mod n;
  // and no subset is has sum 0 mod n.
  // Approach taken here is to keep a list of current solutions.  Expand possible
  // sets one element at a time.  Set will either be a solution, be prohibited by an
  // existing solution, or be retained for further additions.

  private static final class Multiset {
    private final int[] mMultiplicities; // actual multiplicities of each element 0th element is count for 1, etc.
    private int mMaxElement = 1; // largest element stored so far
    private long mSum = 0;
    private int mCardinal = 0;

    private Multiset(final int maxElements) {
      mMultiplicities = new int[maxElements];
    }

    private Multiset(final Multiset e) {
      mMultiplicities = Arrays.copyOf(e.mMultiplicities, e.mMultiplicities.length);
      mMaxElement = e.getMaxElement();
      mSum = e.getSum();
      mCardinal = e.getCardinality();
    }

    private void add(final int v) {
      mMultiplicities[v - 1]++;
      mSum += v;
      ++mCardinal;
      if (v > mMaxElement) {
        mMaxElement = v;
      }
    }

    private int getMaxElement() {
      return mMaxElement;
    }

    private long getSum() {
      return mSum;
    }

    private int getCardinality() {
      return mCardinal;
    }

    @Override
    public boolean equals(final Object other) {
      return other instanceof Multiset && Arrays.equals(mMultiplicities, ((Multiset) other).mMultiplicities);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mMultiplicities);
    }

    private boolean contains(final Multiset m) {
      assert m.mMultiplicities.length == mMultiplicities.length;
      for (int k = 0; k < mMultiplicities.length; ++k) {
        if (m.mMultiplicities[k] > mMultiplicities[k]) {
          return false;
        }
      }
      return true;
    }

    @Override
    public String toString() {
      return Arrays.toString(mMultiplicities);
    }
  }

  private static boolean contains(final List<Multiset> multisets, final Multiset p) {
    for (final Multiset m : multisets) {
      if (p.contains(m)) {
        return true;
      }
    }
    return false;
  }

  protected static int[] count(final int n) {
    final ArrayList<Multiset> invariant = new ArrayList<>();
    ArrayList<Multiset> current = new ArrayList<>();
    current.add(new Multiset(n));
    while (!current.isEmpty()) {
      final ArrayList<Multiset> next = new ArrayList<>();
      for (final Multiset m : current) {
        for (int k = m.getMaxElement(); k <= n; ++k) {
          final Multiset newSet = new Multiset(m);
          newSet.add(k);
          if (!contains(invariant, newSet)) {
            if (newSet.getSum() % n == 0) {
              invariant.add(newSet);
            } else {
              next.add(newSet);
            }
          }
        }
      }
      current = next;
    }
    final int[] profile = new int[n + 1];
    for (final Multiset m : invariant) {
      profile[m.getCardinality()]++;
    }
    return profile;
  }

  private int mN = 0;
  private int mM = 0;
  private int[] mCounts = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mCounts = count(mN);
    }
    return Z.valueOf(mCounts[mM]);
  }
}
