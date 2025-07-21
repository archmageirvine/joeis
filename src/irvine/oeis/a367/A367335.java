package irvine.oeis.a367;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A367335 extends A065091 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.square().add(p.multiply2());
  }
}
