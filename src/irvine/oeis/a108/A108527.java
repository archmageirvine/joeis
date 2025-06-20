package irvine.oeis.a108;
// Generated by gen_seq4.pl 2025-06-08.ack/polyx at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;

/**
 * A108527 Number of labeled mobiles (cycle rooted trees) with n generators.
 * @author Georg Fischer
 */
public class A108527 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A108527() {
    super(1, "[0,1],[1,-1],[-2,1]", "1,A,^2,-,p1,p2,A,*,+,/,int", 0, 1);
  }
}
