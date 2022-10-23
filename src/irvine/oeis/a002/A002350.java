package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002350 Take solution to Pellian equation x^2 - n*y^2 = 1 with smallest positive y and x &gt;= 0; sequence gives a(n) = x, or 1 if n is a square. A002349 gives values of y.
 * @author Sean A. Irvine
 */
public class A002350 extends Sequence1 {

  private long mN = 0;
  private long mNextSquare = 1;
  private long mNextSquareRoot = 1;

  @Override
  public Z next() {
    if (++mN == mNextSquare) {
      ++mNextSquareRoot;
      mNextSquare = mNextSquareRoot * mNextSquareRoot;
      return Z.ONE;
    }
    Z y = Z.ZERO;
    while (true) {
      y = y.add(1);
      final Z[] s = Z.ONE.add(y.square().multiply(mN)).sqrtAndRemainder();
      if (s[1].isZero()) {
        return s[0];
      }
    }
  }
}
