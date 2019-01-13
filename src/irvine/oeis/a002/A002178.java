package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a100.A100640;

/**
 * A002178.
 * @author Sean A. Irvine
 */
public class A002178 extends A002176 {

  @Override
  public Z next() {
    final Z t = super.next();
    return A100640.cotesian(mN, 1).multiply(t).toZ();
  }
}
