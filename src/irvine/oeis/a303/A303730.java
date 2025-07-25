package irvine.oeis.a303;
// Generated by gen_seq4.pl 2025-07-08.ack/polyx at 2025-07-08 21:48

import irvine.oeis.PolynomialFieldSequence;

/**
 * A303730 Number of noncrossing path sets on n nodes with each path having at least two nodes.
 * @author Georg Fischer
 */
public class A303730 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A303730() {
    super(0, "[1],[0, 1,-4, 4],[1,-4, 5,-1]", "p1,p2,/,rev,x,/", 1, 0);
  }
}
