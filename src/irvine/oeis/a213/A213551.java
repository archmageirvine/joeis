package irvine.oeis.a213;
// Generated by gen_seq4.pl A213500/parm3 at 2022-05-01 00:29

import irvine.oeis.a000.A000217;

/**
 * A213551 Rectangular array:  (row n) = b**c, where b(h) = h*(h+1)/2, c(h) = b(n-1+h), n&gt;=1, h&gt;=1, and ** = convolution.
 * @author Georg Fischer
 */
public class A213551 extends A213500 {

  /** Construct the sequence. */
  public A213551() {
    super(new A000217(), new A000217());
  }
}
