package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-06-22.ack/polyx at 2025-06-22 22:11

import irvine.oeis.PolynomialFieldSequence;

/**
 * A355422 Expansion of e.g.f. exp(Sum_{k=1..4} (exp(k*x) - 1)).
 * @author Georg Fischer
 */
public class A355422 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A355422() {
    super(0, "[1],[0,1],[0,2],[0,3],[0,4]", "p1,exp,p2,exp,+,p3,exp,+,p4,exp,+,4,-,exp", 0, 1);
  }
}
