package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A006254 Numbers k such that 2k-1 is prime.
 * @author Sean A. Irvine
 */
public class A006254 extends A065091 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
