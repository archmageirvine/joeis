package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A079266 Subprimorials, extrapolation from primorials by analogy with subfactorials.
 * @author Sean A. Irvine
 */
public class A079266 extends A002110 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).divide(CR.E).round();
  }
}

