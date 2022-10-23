package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005746 Number of n-covers of a 4-set.
 * @author Sean A. Irvine
 */
public class A005746 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(4, ++mN);
  }
}
