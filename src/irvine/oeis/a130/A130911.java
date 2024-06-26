package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a200.A200245;
import irvine.oeis.a200.A200247;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A130911 a(n) is the number of primes with odd binary weight among the first n primes minus the number with an even binary weight.
 * @author Georg Fischer
 */
public class A130911 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A130911() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)), "", new A200247(), new A200245());
  }
}
