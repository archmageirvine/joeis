package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039945 Maris-McGwire numbers(2): numbers k such that f(k) = f(k+1), where f(k) = sum of digits of k + sum of digits of the distinct prime factors of k.
 * @author Sean A. Irvine
 */
public class A039945 extends Sequence1 {

  private long mN = 2;

  private long f(final long k) {
    long sum = Functions.DIGIT_SUM.l(k);
    for (final Z p : Jaguar.factor(k).toZArray()) {
      sum += Functions.DIGIT_SUM.l(p);
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      if (f(++mN) == f(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
