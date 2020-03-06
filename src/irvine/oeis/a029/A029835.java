package irvine.oeis.a029;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A029835 <code>[ log(n-th</code> prime) <code>]</code>.
 * @author Sean A. Irvine
 */
public class A029835 extends A000040 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).log().floor();
  }
}
