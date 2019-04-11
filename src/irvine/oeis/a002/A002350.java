package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002350 Take solution to Pellian equation <code>x^2 -</code> n*y^2 <code>= 1</code> with smallest positive y and <code>x &gt;= 0</code>; sequence gives <code>a(n) = x,</code> or 1 if n is a square. A002349 gives values of y.
 * @author Sean A. Irvine
 */
public class A002350 implements Sequence {

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
      if (Z.ZERO.equals(s[1])) {
        return s[0];
      }
    }
  }
}
