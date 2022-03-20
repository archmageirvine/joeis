package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055382 Smallest prime starting a sequence of 2n consecutive odd primes with symmetrical gaps about the center.
 * @author Sean A. Irvine
 */
public class A055382 extends A055380 {

  private long mM = 4;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final long f = is(mM, mN);
      if (f != 0) {
        return Z.valueOf(f);
      }
      ++mM;
    }
  }
}
