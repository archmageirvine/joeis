package irvine.oeis.a129;
// Generated by gen_seq4.pl 2025-06-28.ack/polya at 2025-06-28 22:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000005;

/**
 * A129921 Number of generalized compositions of n: words b_1^{i_1}b_2^{i_2}...b_k^{i_k} such that b_j's and j_i's are positive integers and sum b_j*i_j = n.
 * new A000005()
 * @author Georg Fischer
 */
public class A129921 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A129921() {
    super(0, "[1]", "1,1,x,B,-,/", 0, 0, 1, 1, new A000005());
  }
}
