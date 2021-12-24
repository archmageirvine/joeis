package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053432 Numbers with digits in alphabetical order (in English).
 * @author Sean A. Irvine
 */
public class A053432 implements Sequence {

  private final long[] mSort;
  private final TreeSet<Z> mA = new TreeSet<>();

  protected A053432(final long... sort) {
    mSort = sort;
    mA.add(Z.ZERO);
  }

  /** Construct the sequence. */
  public A053432() {
    this(8, 5, 4, 9, 1, 7, 6, 3, 2, 0);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long r = res.mod(10);
    int k = 0;
    if (!res.isZero()) {
      while (mSort[k] != r) {
        ++k;
      }
    }
    final Z r10 = res.multiply(10);
    do {
      final Z q = r10.add(mSort[k]);
      if (!q.isZero()) {
        mA.add(q);
      }
    } while (++k != mSort.length);
    return res;
  }
}
