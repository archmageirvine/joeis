package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075317.
 * @author Sean A. Irvine
 */
public class A075319 extends A075317 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return super.next().multiply2().add(mN);
  }
}
