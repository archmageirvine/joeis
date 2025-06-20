package irvine.oeis.a137;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a278.A278229;

/**
 * A137288 Numbers k such that 2*prime(k)-1 is prime.
 * @author Georg Fischer
 */
public class A137288 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A137288() {
    super(1, 1, new A278229(), v -> v.equals(Z.TWO));
  }
}
