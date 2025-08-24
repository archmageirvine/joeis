package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079636 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return CR.valueOf(q).sqrt().subtract(CR.valueOf(p).sqrt()).inverse().ceil();
  }
}

