package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002349 Take solution to Pellian equation x^2 - n*y^2 = 1 with smallest positive y and x &gt;= 0; sequence gives a(n) = y, or 0 if n is a square. A002350 gives values of x.
 * @author Sean A. Irvine
 */
public class A002349 extends Sequence1 {

  private long mN = 0;
  private long mNextSquare = 1;
  private long mNextSquareRoot = 1;

  @Override
  public Z next() {
    if (++mN == mNextSquare) {
      ++mNextSquareRoot;
      mNextSquare = mNextSquareRoot * mNextSquareRoot;
      return Z.ZERO;
    }
    Z y = Z.ZERO;
    while (true) {
      y = y.add(1);
      if (Z.ONE.add(y.square().multiply(mN)).isSquare()) {
        return y;
      }
    }
  }
}
