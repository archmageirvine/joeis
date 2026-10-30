package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087091 Numbers k such that p = k^2 + k + 41 and p - 2 are twin primes.
 * @author Sean A. Irvine
 */
public class A087091 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087091() {
    super(1, 0, k -> {
      final Z t = Z.valueOf(k).square().add(k + 41);
      return t.isProbablePrime() && t.subtract(2).isProbablePrime();
    });
  }
}
