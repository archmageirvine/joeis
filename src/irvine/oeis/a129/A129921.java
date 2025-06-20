package irvine.oeis.a129;
// Generated by gen_seq4.pl 2025-06-01.ack/invtraf at 2025-06-01 21:15

import irvine.oeis.a000.A000005;
import irvine.oeis.transform.InvertTransform;

/**
 * A129921 Number of generalized compositions of n: words b_1^{i_1}b_2^{i_2}...b_k^{i_k} such that b_j's and j_i's are positive integers and sum b_j*i_j = n.
 * @author Georg Fischer
 */
public class A129921 extends InvertTransform {

  /** Construct the sequence. */
  public A129921() {
    super(0, new A000005());
  }
}
