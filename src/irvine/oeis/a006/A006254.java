package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A006254 Numbers k such that 2k-1 is prime.
 * @author Sean A. Irvine
 */
public class A006254 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
