package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a007.A007416;

/**
 * A079717 Subminimal numbers, from minimal numbers by analogy with subfactorials.
 * @author Sean A. Irvine
 */
public class A079717 extends A007416 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).divide(CR.E).add(CR.HALF).floor();
  }
}

