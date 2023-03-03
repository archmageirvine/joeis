package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005783 Number of 3-covers of an unlabeled n-set.
 * @author Sean A. Irvine
 */
public class A005783 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return A005747.covers(++mN, 3);
  }
}
