package irvine.oeis.a317;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A317797 Sum of the norm of divisors of n over Gaussian integers, with associated divisors counted only once.
 * Multiplicative with: a(2^e) = sigma(2^(2e)) = 2^(2e+1) - 1, a(p^e) = sigma(p^e)^2 = ((p^(e+1) - 1)/(p - 1))^2 if p == 1 (mod 4) and sigma_2(p^e) = A001157(p^e) = (p^(2e+2) - 1)/(p^2 - 1) if p == 3 (mod 4).
 * @author Georg Fischer
 */
public class A317797 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A317797() {
    super(1, (p, e) -> is2(p) ? Z.TWO.pow(2L * e + 1).subtract(1) : (isMod(4, p, 1) ? sigmaP(p, e).square() : sigmaP2(p, 2 * e + 1)));
  }
}
