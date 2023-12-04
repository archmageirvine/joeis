package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A067100.
 * @author Sean A. Irvine
 */
public class A067100 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cot(CR.PI.divide(CR.valueOf(++mN))).divide(2).floor();
  }
}
