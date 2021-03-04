package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A039965 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039965 extends A000108 {

  private long mMult = -1;

  @Override
  public Z next() {
    final long r = super.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

