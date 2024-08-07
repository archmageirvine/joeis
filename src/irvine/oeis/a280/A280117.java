package irvine.oeis.a280;
// Generated by gen_seq4.pl 2024-07-11/partprod at 2024-07-11 18:00

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a266.A266265;

/**
 * A280117 Partial products of A266265 (Product_{d|n} pod(d)), where pod(n) is the product of the divisors of n (A007955).
 * @author Georg Fischer
 */
public class A280117 extends PartialProductSequence {

  /** Construct the sequence. */
  public A280117() {
    super(1, new A266265());
  }
}
