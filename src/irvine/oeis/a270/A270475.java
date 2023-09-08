package irvine.oeis.a270;
// manually 2023-09-08/filtpos at 2023-09-08 15:21

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a003.A003266;

/**
 * A270475 Integers n such that A003266(n) is not divisible by n*(n+1)/2.
 * @author Georg Fischer
 */
public class A270475 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A270475() {
    super(1, 1, new A003266().skip(1), (k, v) -> v.mod(k * (k + 1) / 2) != 0);
  }
}
