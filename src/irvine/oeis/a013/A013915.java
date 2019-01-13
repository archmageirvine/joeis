package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013915.
 * @author Sean A. Irvine
 */
public class A013915 extends A013655 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
