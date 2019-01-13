package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A016040.
 * @author Sean A. Irvine
 */
public class A016040 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return CR.valueOf(super.next()).log().floor(32);
  }
}
