package irvine.oeis.a176;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.a338.A338912;
import irvine.oeis.a338.A338913;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A176506 Difference between the prime indices of the two factors of the n-th semiprime.
 * @author Georg Fischer
 */
public class A176506 extends PairTransformSequence {

  /** Construct the sequence. */
  public A176506() {
    super(1, new A338913(), new A338912(), (n, u, v) -> u.subtract(v));
  }
}
