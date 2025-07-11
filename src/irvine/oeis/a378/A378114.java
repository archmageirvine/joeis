package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a006.A006149;

/**
 * A378114 Number of 3-tuples (p_1, p_2, p_3) of Dyck paths of semilength n, such that each p_i is never below p_{i-1} and the upper path p_3 only touches the x-axis at its endpoints.
 * new A006149()
 * @author Georg Fischer
 */
public class A378114 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A378114() {
    super(0, "[1]", "2,1,x,B,/,-", 0, 0, 1, 1, new A006149());
  }
}
