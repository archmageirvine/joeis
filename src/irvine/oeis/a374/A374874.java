package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-09-16.ack/obvecon at 2024-09-16 19:36

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000142;

/**
 * A374874 Obverse convolution (2^n)**(n!); see Comments.
 * @author Georg Fischer
 */
public class A374874 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A374874() {
    super(0, new A000079(), new A000142());
  }
}
