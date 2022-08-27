package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005783 Number of 3-covers of an n-set.
 * @author Sean A. Irvine
 */
public class A005783 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return A005747.covers(++mN, 3);
  }
}
