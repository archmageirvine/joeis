package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.a007.A007256;

/**
 * A112147 McKay-Thompson series of class 12A for the Monster group.
 * @author Sean A. Irvine
 */
public class A112147 extends A007256 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
