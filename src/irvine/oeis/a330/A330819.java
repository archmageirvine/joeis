package irvine.oeis.a330;
// Generated by gen_seq4.pl 2024-09-12.ack/sintrif at 2024-09-12 20:55

import irvine.oeis.a000.A000668;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A330819 Numbers of the form M_p^2(M^p+2)^2, where M_p is a Mersenne prime (A000668) and p is a Mersenne exponent (A000043). Also the first element of the spectral basis of A330817.
 * @author Georg Fischer
 */
public class A330819 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A330819() {
    super(1, (term, n) -> term.square().multiply((term.add(2)).square()), "", new A000668());
  }
}
