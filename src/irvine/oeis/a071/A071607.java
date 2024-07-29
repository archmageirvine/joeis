package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a007.A007705;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071607 extends A007705 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return super.next().divide(mN);
  }
}
