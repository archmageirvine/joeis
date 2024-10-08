package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-09-16.ack/obvecon at 2024-09-16 19:36

import irvine.oeis.ObverseConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a038.A038608;

/**
 * A374894 Obverse convolution (n)**(n*(-1)^n); see Comments.
 * @author Georg Fischer
 */
public class A374894 extends ObverseConvolutionSequence {

  /** Construct the sequence. */
  public A374894() {
    super(0, new A001477(), new A038608());
  }
}
