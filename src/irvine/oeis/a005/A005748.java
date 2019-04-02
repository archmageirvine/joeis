package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005748 Number of n-covers of a 7-set.
 * @author Sean A. Irvine
 */
public class A005748 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(7, ++mN);
  }
}
