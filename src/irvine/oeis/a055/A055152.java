package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a003.A003180;

/**
 * A055152 Proper covers of an unlabeled n-set.
 * a(n) = (A003180(n) - 2*A003180(n-1))/4.
 * @author Georg Fischer
 */
public class A055152 extends A003180 {

  private Z mA1;

  /** Construct the sequence. */
  public A055152() {
    mA1 = super.next();
  }

  @Override
  public Z next() {
    final Z mA = super.next();
    final Z result = mA.subtract(mA1.multiply2()).divide(4);
    mA1 = mA;
    return result;
  }
}
