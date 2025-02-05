package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074976 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return CR.valueOf(mPrime.nextPrime(p)).sqrt().subtract(CR.valueOf(p).sqrt()).inverse().round();
  }
}
