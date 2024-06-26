package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-04-25/multraf at 2024-04-25 23:20

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A283986 a(n) = A002487(n-1) OR A002487(n), where OR is bitwise-or (A003986).
 * @author Georg Fischer
 */
public class A283986 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A283986() {
    super(1, (self, n) -> self.s(1).or(self.s(0)), "", new A002487(), PREVIOUS);
  }
}
