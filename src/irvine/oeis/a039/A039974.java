package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a006.A006318;

/**
 * A039974 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039974 extends A006318 {

  private long mMult = -1;

  @Override
  public Z next() {
    final long r = super.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

