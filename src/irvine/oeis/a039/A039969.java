package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;

/**
 * A039969 An example of a d-perfect sequence: a(n) = Catalan(n) mod 3.
 * @author Sean A. Irvine
 */
public class A039969 extends A001006 {

  private long mMult = 0;

  @Override
  public Z next() {
    if (mMult == 0) {
      mMult = -1;
      return Z.ONE;
    }
    final long r = super.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

