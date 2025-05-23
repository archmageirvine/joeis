package irvine.oeis.a339;
// Generated by gen_seq4.pl 2025-05-11.ack/polya at 2025-05-11 22:56

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002572;

/**
 * A339479 Number of partitions consisting of n parts, each of which is a power of 2, where one part is 1 and no part is more than twice the sum of all smaller parts.
 * new A002572()
 * @author Georg Fischer
 */
public class A339479 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A339479() {
    super(1, "[1],[1,-1]", "x,p1,x,S,-,/", 0, 0, 1, 1, new A002572());
  }
}
