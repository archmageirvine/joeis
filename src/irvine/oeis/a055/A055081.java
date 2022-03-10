package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055081 Number of positive integers whose harmonic mean with n is a positive integer.
 * @author Sean A. Irvine
 */
public class A055081 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final Z n2 = Z.valueOf(2L * mN);
    for (final Z d : Cheetah.factor(Z.valueOf(mN).square().multiply2()).divisors()) {
      if (d.compareTo(n2) < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

