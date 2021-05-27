package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a038.A038150;

/**
 * A047925 3rd column of array in A038150.
 * @author Sean A. Irvine
 */
public class A047925 extends A038150 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 3L);
  }
}
