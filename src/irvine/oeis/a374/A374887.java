package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-09-16.ack/obvecon at 2024-09-16 19:36

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000290;

/**
 * A374887 Obverse convolution (n^2)**(2^n); see Comments.
 * @author Georg Fischer
 */
public class A374887 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A374887() {
    super(0, new A000290(), new A000079());
  }
}
