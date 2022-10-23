package irvine.oeis.a254;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A254429 a(0) = 0; for n &gt;= 0, a(n+1) = 2^a(n) + 1.
 * @author Georg Fischer
 */
public class A254429 extends Sequence0 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A254429() {
    mN = -1;
    mA = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA;
    } else if (mN >= 5) {
      throw new ArithmeticException("implementation limit in A254429 (n <= 4) reached");
    }
    mA = Z.ONE.shiftLeft(mA.intValue()).add(1);
    return mA;
  }
}
