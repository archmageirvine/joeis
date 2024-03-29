package irvine.oeis.a213;
// Generated by gen_seq4.pl 2023-12-02/holos at 2023-12-03 21:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A213873 Number of words w where each letter of the ternary alphabet occurs n times and for every prefix z of w we have #(z,a_i) = 0 or #(z,a_i) &gt;= #(z,a_j) for all j&gt;i and #(z,a_i) counts the occurrences of the i-th letter in z.
 * @author Georg Fischer
 */
public class A213873 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A213873() {
    super(0, "[[0],[720,-20892, 111636,-157611,-67293, 285369,-197559, 43038],[-720, 2484, 5792,-8893,-5977, 8039, 941,-1594]]", "1, 6", 0);
  }
}
