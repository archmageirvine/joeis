package irvine.oeis.a043;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043298 Numbers n such that B(6*n) has denominator 42 where B(2k) are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A043298 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      int smallPrimes = 0;
      for (final Z d : Cheetah.factor(6 * ++mN).divisors()) {
        final Z t = d.add(1);
        if (t.isProbablePrime()) {
          if (t.compareTo(Z.SEVEN) > 0) {
            continue outer;
          }
          smallPrimes |= 1 << t.intValue();
        }
      }
      if (smallPrimes == 0b10001100) {
        return Z.valueOf(mN);
      }
    }
  }
}

