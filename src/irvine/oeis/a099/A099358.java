package irvine.oeis.a099;
// manually partsum at 2021-09-27 19:25

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a055.A055565;

/**
 * A099358 a(n) = sum of digits of k^4 as k runs from 1 to n.
 * @author Georg Fischer
 */
public class A099358 extends PartialSumSequence {

  /** Construct the sequence. */
  public A099358() {
    super(1, new A055565());
    super.next();
  }
}
