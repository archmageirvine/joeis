package irvine.oeis.a353;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.factor.factor.Jaguar;
import irvine.oeis.MultiplicativeSequence;

/**
 * A353752 Multiplicative with a(p^e) = phi(sigma(p^e)).
 * Multiplicative with: a(p^e) = phi(sigma(p^e)).
 * @author Georg Fischer
 */
public class A353752 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A353752() {
    super(1, (p, e) -> Jaguar.factor(Jaguar.factor(p.pow(e)).sigma()).phi());
  }
}
