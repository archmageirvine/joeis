package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a007.A007317;

/**
 * A039971 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039971 extends A007317 {

  private long mMult = -1;

  @Override
  public Z next() {
    final long r = super.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

