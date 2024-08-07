package irvine.oeis.a351;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A351475 Multiplicative with a(prime(k)^e) = k^2 + e^2 for any k, e &gt; 0.
 * Multiplicative with: a(prime(k)^e) = k^2 + e^2 for any k, e > 0.
 * @author Georg Fischer
 */
public class A351475 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A351475() {
    super(1, (p, e) -> {
      final long k = Functions.PRIME_PI.l(p);
      return Z.valueOf(k * k + (long) e * e);
    });
  }
}
