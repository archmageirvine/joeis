package irvine.oeis.a305;
// Generated by gen_seq4.pl 2025-06-10.ack/polyxa at 2025-06-10 21:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a036.A036968;

/**
 * A305922 Expansion of e.g.f. log(1 + 2*x/(exp(x) + 1)).
 * egf(new A036968())
 * @author Georg Fischer
 */
public class A305922 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A305922() {
    super(0, "[1]", "1,x,B,+,log", 0, 1, 1, 1, egf(new A036968()));
  }
}
