package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-27.ack/obvecon at 2024-08-27 22:38

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a001.A001477;

/**
 * A374881 Obverse convolution (n)**(n^2); see Comments.
 * @author Georg Fischer
 */
public class A374881 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A374881() {
    super(0, new A001477(), new A000290());
  }
}
