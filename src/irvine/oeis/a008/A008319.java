package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008319 Smallest number that is sum of squares of distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A008319 extends MemorySequence {

  private static final Z Z892 = Z.valueOf(892);
  private final TreeSet<Z> mSumSquares = new TreeSet<>();
  private long mN = 0;
  {
    setOffset(1);
    mSumSquares.add(Z.TWO);
  }

  private void addSquare(final Z n) {
    if (Z892.compareTo(n) > 0) {
      mSumSquares.add(n);
    }
  }

  private void insertNewSquares(final Z sum, final int k) {
    if (k < size() && Z892.compareTo(sum) > 0) {
      // Include element k in the sum
      final Z t = sum.add(a(k).square());
      addSquare(t);
      insertNewSquares(t, k + 1);
      // Don't use element k
      insertNewSquares(sum, k + 1);
    }
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    final Z res = mSumSquares.pollFirst();
    final Z s = res.square();
    addSquare(s);
    insertNewSquares(s, 0);
    return res;
  }

  @Override
  public Z next() {
    if (++mN <= 572) {
      return super.next();
    }
    return Z.valueOf(mN + 320);
  }
}
