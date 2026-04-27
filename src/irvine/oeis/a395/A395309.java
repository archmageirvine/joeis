package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395309 Numbers k such that tau(k) = tau(k + d), where d is some divisor of k where tau(i) = A000005(i).
 * @author Sean A. Irvine
 */
public class A395309 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395309() {
    super(1, k -> {
      final long s0 = Functions.SIGMA0.l(k);
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (Functions.SIGMA0.l(d.add(k)) == s0) {
          return true;
        }
      }
      return false;
    });
  }
}
