package irvine.oeis.a348;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A348193 (Number of primes == 3 mod 4 less than n^2) - (number of primes == 1 mod 4 less than n^2).
 * @author Georg Fischer
 */
public class A348193 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A348193() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)), "", new A348195(), new A348196());
  }
}
