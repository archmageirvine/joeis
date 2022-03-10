package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005747;

/**
 * A055066 Number of 7-covers of an n-set.
 * @author Sean A. Irvine
 */
public class A055066 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(++mN, 7);
  }
}
