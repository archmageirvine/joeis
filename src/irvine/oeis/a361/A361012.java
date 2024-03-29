package irvine.oeis.a361;
// Generated by gen_seq4.pl multm/mult at 2023-03-28 18:24

import irvine.factor.factor.Jaguar;
import irvine.oeis.MultiplicativeSequence;

/**
 * A361012 Multiplicative with a(p^e) = sigma(e), where sigma = A000203.
 * @author Georg Fischer
 */
public class A361012 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A361012() {
    super(1, (p, e) -> Jaguar.factor(e).sigma(1));
  }
}
