package irvine.oeis.a272;
// manually 2023-09-08/filtpos at 2023-09-08 15:21

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a054.A054640;

/**
 * A272446 Numbers n such that A054640(n) is not divisible by n.
 * @author Georg Fischer
 */
public class A272446 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A272446() {
    super(1, 1, new A054640().skip(1), (k, v) -> v.mod(k) != 0);
  }
}
