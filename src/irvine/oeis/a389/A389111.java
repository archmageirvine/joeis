package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389111 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A389111 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(2 * (++mN + 1)).sqrt().divide(3).round().square().multiply(9).add(2 * mN);
  }
}
