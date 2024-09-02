package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072061 [t], 1+[t], [2t], 2+[2t], [3t], 3+[3t], ..., where t=tau = (1+sqrt(5))/2 and []=floor.
 * @author Sean A. Irvine
 */
public class A072061 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return (++mN & 1) == 1 ? CR.PHI.multiply(mN / 2).floor().add(mN / 2) : CR.PHI.multiply(mN / 2).floor();
  }
}
