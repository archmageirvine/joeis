package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087090 Positive numbers k such that p=k^2+k+41 and p+2 are twin primes.
 * @author Sean A. Irvine
 */
public class A087090 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087090() {
    super(1, 0, k -> {
      final Z t = Z.valueOf(k).square().add(k + 41);
      return t.isProbablePrime() && t.add(2).isProbablePrime();
    });
  }
}
