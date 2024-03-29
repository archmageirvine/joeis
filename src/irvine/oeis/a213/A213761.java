package irvine.oeis.a213;
// Generated by gen_seq4.pl A213500/parm3 at 2022-05-01 00:29

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a016.A016777;

/**
 * A213761 Rectangular array:  (row n) = b**c, where b(h) = h, c(h) = 3*n-5+3*h, n&gt;=1, h&gt;=1, and ** = convolution.
 * @author Georg Fischer
 */
public class A213761 extends A213500 {

  /** Construct the sequence. */
  public A213761() {
    super(new A001477(), new PrependSequence(new A016777(), 0));
  }
}
