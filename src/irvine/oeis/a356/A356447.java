package irvine.oeis.a356;
// Generated by gen_seq4.pl 2025-05-02.ack/filnum at 2025-05-02 12:03

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A356447 Integers k such that (k+1)*(2*k-1) does not divide the central binomial coefficient B(k) = binomial(2*k,k) = A000984(k).
 * @author Georg Fischer
 */
public class A356447 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A356447() {
    super(1, 1, k -> !Binomial.binomial(2 * k, k).mod(Z.valueOf(k + 1).multiply(2 * k - 1)).isZero());
  }
}
