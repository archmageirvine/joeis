package irvine.oeis.a163;
// manually partsumm/partsum at 2022-04-12 20:22

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a129.A129808;

/**
 * A163120 Sum of the first n digits of the concatenation of all nonprimes.
 * @author Georg Fischer
 */
public class A163120 extends PartialSumSequence {

  /** Construct the sequence. */
  public A163120() {
    super(1, new PrependSequence(new A129808(), 0));
  }
}
