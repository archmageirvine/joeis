package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070749 Nearest integer to sin(prime(n)), prime=A000040.
 * @author Sean A. Irvine
 */
public class A070749 extends A000040 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).sin().round();
  }
}
