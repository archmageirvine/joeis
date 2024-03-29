package irvine.oeis.a162;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A162419 a(n) = sigma(n)*|A002129(n)| where sigma(n) = A000203(n).
 * Multiplicative with: a(2^e) = (2^(e+1)-1)*(2^(e+1)-3), and a(p^e) = ((p^(e+1)-1)/(p - 1))^2 for p > 2.
 * @author Georg Fischer
 */
public class A162419 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A162419() {
    super(1, (p, e) -> is2(p) ? Z.TWO.pow(e + 1).subtract(1).multiply(Z.TWO.pow(e + 1).subtract(3)) : sigmaP(p, e).square());
  }
}
