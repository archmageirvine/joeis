package irvine.oeis.a306;
// Generated by gen_seq4.pl 2025-07-17.ack/polyxa at 2025-07-18 00:03

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a005.A005651;
import irvine.oeis.a007.A007837;

/**
 * A306041 Expansion of e.g.f. Product_{k&gt;=1} (1 + x^k/k!)/(1 - x^k/k!).
 * egf(new A005651()), egf(new A007837())
 * @author Georg Fischer
 */
public class A306041 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A306041() {
    super(0, "[1]", "x,B,x,C,*", 0, 1, 1, 1, egf(new A005651()), egf(new A007837()));
  }
}
