package irvine.oeis.a198;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A198076 Round((n+1/2)^n).
 * @author Sean A. Irvine
 */
public class A198076 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).add(CR.HALF).pow(mN).round();
  }
}
