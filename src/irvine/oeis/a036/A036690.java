package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A036690 Product of a prime and the following number.
 * @author Sean A. Irvine
 */
public class A036690 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.square().add(p);
  }
}
