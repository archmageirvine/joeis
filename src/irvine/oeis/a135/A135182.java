package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.oeis.a001.A001248;
import irvine.oeis.a030.A030078;
import irvine.oeis.a050.A050997;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A135182 p^5 + p^3 + p^2. Exponents are prime numbers and p = prime(n).
 * @author Georg Fischer
 */
public class A135182 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A135182() {
    super(1, (self, n) -> self.s(0).add(self.s(1)).add(self.s(2)), "", new A001248(), new A030078(), new A050997());
  }
}
