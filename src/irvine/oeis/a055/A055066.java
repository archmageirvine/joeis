package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005747;

/**
 * A055066 Number of 7-covers of an n-set.
 * @author Sean A. Irvine
 */
public class A055066 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return A005747.covers(++mN, 7);
  }
}
