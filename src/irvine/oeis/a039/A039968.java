package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a005.A005043;

/**
 * A039968 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039968 extends A005043 {

  private long mMult = -1;

  @Override
  public Z next() {
    final long r = super.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

