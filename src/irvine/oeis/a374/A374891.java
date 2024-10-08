package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-27.ack/obvecon at 2024-08-27 22:38

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a000.A000984;

/**
 * A374891 Obverse convolution (1)**A000984; see Comments.
 * @author Georg Fischer
 */
public class A374891 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A374891() {
    super(0, new A000012(), new A000984());
  }
}
