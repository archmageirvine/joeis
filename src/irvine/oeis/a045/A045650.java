package irvine.oeis.a045;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045650 Numbers that cannot be expressed as k + floor(log(k)) where k is an integer.
 * @author Sean A. Irvine
 */
public class A045650 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).exp().floor().add(mN);
  }
}
