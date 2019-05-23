package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a022.A022897;

/**
 * A022897.
 * @author Sean A. Irvine
 */
public class A083309 extends A022897 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return get(3L, mN);
  }
}
