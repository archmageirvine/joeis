package irvine.oeis.a347;
// Generated by gen_seq4.pl multman/mult at 2023-10-03 19:56

import irvine.factor.prime.Puma;
import irvine.oeis.MultiplicativeSequence;

/**
 * A347101 Fully multiplicative with a(prime(k)) = A001223(k), where A001223 gives the distance from the k-th prime to the (k+1)-th prime.
 * Multiplicative with: a(prime(k)) = A001223(k), where A001223 gives the distance from the k-th prime to the (k+1)-th prime.
 * @author Georg Fischer
 */
public class A347101 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A347101() {
    super(1, (p, e) -> {
      final long k = Puma.primePi(p);
      return Puma.primeZ(k + 1).subtract(p).pow(e);
    });
  }
}
