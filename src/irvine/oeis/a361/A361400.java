package irvine.oeis.a361;

import irvine.math.z.Z;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A361400 extends A361136 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
