package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005771 Number of n-covers of an unlabeled 5-set.
 * @author Sean A. Irvine
 */
public class A005771 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(5, ++mN);
  }
}
