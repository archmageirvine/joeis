package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a035.A035486;

/**
 * A007063.
 * @author Sean A. Irvine
 */
public class A007063 extends A035486 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(k(++mN, mN));
  }
}
