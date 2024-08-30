package irvine.oeis.a038;

import java.util.LinkedList;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057117;

/**
 * A038776 The sequence a[1] to a[ cat[n] ] is the permutation that converts forest[n] of depth-first planar planted binary trees into breadth-first representation.
 * @author Sean A. Irvine
 */
public class A038776 extends A014486 {

  /** Construct the sequence. */
  public A038776() {
    super(1);
    super.next(); // skip 0
  }

  private final TreeMap<Z, Long> mOrdering = new TreeMap<>();
  private final LinkedList<Z> mA = new LinkedList<>();
  private int mBitCount = 1;
  private long mM = 0;
  private long mN = -1;

  private void step() {
    Z t = super.next();
    if (t.bitCount() == mBitCount) {
      mOrdering.put(t, ++mN);
      mA.add(t);
    } else {
      mOrdering.clear();
      mA.clear();
      mN = mM - 1;
      for (int k = 0; k <= mN; ++k) {
        t = super.next();
      }
      mOrdering.put(t, ++mN);
      mA.add(t);
      mBitCount = t.bitCount();
    }
  }

  private long getIndex(final Z n) {
    while (!mOrdering.containsKey(n)) {
      step();
    }
    // We can remove because this is a permutation
    return mOrdering.remove(n);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      step();
    }
    ++mM;
    final Z n = mA.pollFirst();
    return Z.valueOf(getIndex(A057117.bfsTodfs(n)) + 1);
  }
}
