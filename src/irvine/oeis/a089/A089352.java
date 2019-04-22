package irvine.oeis.a089;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A089352 Numbers n such that n is divisible by the sum of its distinct prime factors (A008472).
 * @author Sean A. Irvine
 */
public class A089352 implements Sequence {

  private long mN = 1;

  protected long distinctSigma(final long n) {
    long sum = 0;
    for (final Z p : Cheetah.factor(n).toZArray()) {
      sum += p.longValue();
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN % distinctSigma(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
