package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A075039 Smallest of three consecutive squarefree numbers having equal numbers of prime factors.
 * @author Sean A. Irvine
 */
public class A075039 extends A005117 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.subtract(t).equals(Z.TWO)) {
        final long omega = Functions.BIG_OMEGA.l(t);
        if (omega == Functions.BIG_OMEGA.l(mA) && omega == Functions.BIG_OMEGA.l(mB)) {
          return t;
        }
      }
    }
  }
}
