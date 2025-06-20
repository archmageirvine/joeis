package irvine.oeis.a188;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a003.A003024;

/**
 * A188490 Exponential transform of A003024, number of acyclic digraphs with n labeled nodes.
 * new A003024()
 * @author Georg Fischer
 */
public class A188490 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A188490() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A003024());
  }
}
