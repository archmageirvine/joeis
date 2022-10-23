package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005785 Number of 5-covers of an n-set.
 * @author Sean A. Irvine
 */
public class A005785 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return A005747.covers(++mN, 5);
  }
}
