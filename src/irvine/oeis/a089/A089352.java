package irvine.oeis.a089;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089352 Numbers that are divisible by the sum of their distinct prime factors (A008472).
 * @author Sean A. Irvine
 */
public class A089352 extends Sequence1 {

  private long mN = 1;

  protected long distinctSigma(final long n) {
    long sum = 0;
    for (final Z p : Jaguar.factor(n).toZArray()) {
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
