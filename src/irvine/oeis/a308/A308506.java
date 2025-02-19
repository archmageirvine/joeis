package irvine.oeis.a308;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A308506 Expansion of e.g.f.: -1/(1-LambertW(-2*x)).
 * -1/(1-lambertW(-2*x))
 * @author Georg Fischer
 */
public class A308506 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A308506() {
    super(0, "[[1]]", ";0;1;1;0;2;x;*;-;lambertW;-;/;-", 0, 1);
  }
}
