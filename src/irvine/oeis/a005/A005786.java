package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005786 Number of 6-covers of an n-set.
 * @author Sean A. Irvine
 */
public class A005786 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return A005747.covers(++mN, 6);
  }
}
