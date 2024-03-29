package irvine.oeis.a260;
// Generated by gen_seq4.pl 2023-09-08/filtpos at 2023-09-08 15:21

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008908;

/**
 * A260801 Primes p such that A008908(p) is also prime.
 * @author Georg Fischer
 */
public class A260801 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A260801() {
    super(1, 1, new A008908(), (k, v) -> Z.valueOf(k).isProbablePrime() && v.isProbablePrime());
  }
}
