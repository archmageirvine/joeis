package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074500 Difference between n*sqrt(n)+1 and prime(n), rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A074500 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(mN).round().add(1).subtract(super.next());
  }
}
