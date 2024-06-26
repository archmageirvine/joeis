package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.a010.A010051;
import irvine.oeis.a059.A059841;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A370482 Characteristic function of primes plus characteristic function of even numbers.
 * @author Georg Fischer
 */
public class A370482 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A370482() {
    super(0, (self, n) -> self.s(0).add(self.s(1)), "", new A010051(), new A059841());
  }
}
