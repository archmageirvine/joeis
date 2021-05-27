package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a038.A038150;

/**
 * A047923 Main diagonal of array in A038150.
 * @author Sean A. Irvine
 */
public class A047923 extends A038150 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
