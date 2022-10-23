package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053433 Numbers with distinct digits in alphabetical order (in English).
 * @author Sean A. Irvine
 */
public class A053433 extends Sequence1 {

  private final long[] mSort;
  private final TreeSet<Z> mA = new TreeSet<>();

  protected A053433(final long... sort) {
    mSort = sort;
    mA.add(Z.ZERO);
  }

  /** Construct the sequence. */
  public A053433() {
    this(8, 5, 4, 9, 1, 7, 6, 3, 2, 0);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z res = mA.pollFirst();
    final long r = res.mod(10);
    int k = -1;
    if (!res.isZero()) {
      while (mSort[++k] != r) {
        // do nothing
      }
    }
    final Z r10 = res.multiply(10);
    while (++k != mSort.length) {
      final Z q = r10.add(mSort[k]);
      if (!q.isZero()) {
        mA.add(q);
      }
    }
    return res;
  }
}
