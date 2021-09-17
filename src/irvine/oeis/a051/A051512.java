package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051512 a(n) = floor(tan(prime(n))).
 * @author Sean A. Irvine
 */
public class A051512 extends A000040 {

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.tan(CR.valueOf(super.next())).floor();
  }
}

