package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029836 log( n-th prime) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A029836 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return CR.valueOf(super.next()).log().round();
  }
}
