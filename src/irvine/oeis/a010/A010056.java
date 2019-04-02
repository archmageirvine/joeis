package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A010056 Characteristic function of Fibonacci numbers: a(n) = 1 if n is a Fibonacci number, otherwise 0.
 * @author Sean A. Irvine
 */
public class A010056 extends A000045 {

  private Z mNext = super.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mNext)) {
      do {
        mNext = super.next();
      } while (mNext.equals(mN));
      return Z.ONE;
    }
    return Z.ZERO;
  }
}

