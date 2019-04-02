package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005785 Number of 5-covers of an n-set.
 * @author Sean A. Irvine
 */
public class A005785 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(++mN, 5);
  }
}
