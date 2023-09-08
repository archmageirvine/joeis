package irvine.oeis.a270;
// manually 2023-09-08/filtpos at 2023-09-08 15:21

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a003.A003266;

/**
 * A270777 Integers k such that A003266(k) is not divisible by k.
 * @author Georg Fischer
 */
public class A270777 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A270777() {
    super(1, 1, new A003266().skip(1), (k, v) -> v.mod(k) != 0L);
  }
}
