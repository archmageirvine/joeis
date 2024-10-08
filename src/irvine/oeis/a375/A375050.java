package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-08-27.ack/obvecon at 2024-08-27 22:38

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a000.A000217;

/**
 * A375050 Obverse convolution (n(n+1)/2)**(n(n+1)/2); see Comments.
 * @author Georg Fischer
 */
public class A375050 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A375050() {
    super(0, new A000217(), new A000217());
  }
}
