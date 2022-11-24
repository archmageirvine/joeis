package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a331.A331571;

/**
 * A060491 Number of ordered tricoverings of an unlabeled n-set.
 * @author Sean A. Irvine
 */
public class A060491 extends A331571 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(3, ++mN);
  }
}
