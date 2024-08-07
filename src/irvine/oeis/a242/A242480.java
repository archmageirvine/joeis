package irvine.oeis.a242;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.oeis.a054.A054024;
import irvine.oeis.a142.A142150;
import irvine.oeis.a229.A229110;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A242480 a(n) = (n*(n+1)/2) mod n + sigma(n) mod n + antisigma(n) mod n.
 * @author Georg Fischer
 */
public class A242480 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A242480() {
    super(1, (self, n) -> self.s(0).add(self.s(1)).add(self.s(2)), "", new A142150(), new A054024(), new A229110());
  }
}
