package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-27.ack/obvecon at 2024-08-27 22:38

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a000.A000040;

/**
 * A374851 Obverse convolution A000040**A000040; see Comments.
 * @author Georg Fischer
 */
public class A374851 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A374851() {
    super(1, new A000040(), new A000040());
  }
}
