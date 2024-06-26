package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-05-25/filter at 2024-05-25 23:20

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A188130 Primes p such that 6p+1 divides the Mersenne number M(p)=A000225(p).
 * @author Georg Fischer
 */
public class A188130 extends FilterSequence {

  /** Construct the sequence. */
  public A188130() {
    super(1, new A000040(), p -> Z.TWO.pow(p).subtract(1).mod(p.multiply(6).add(1)).isZero());
  }
}
