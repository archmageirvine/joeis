package irvine.oeis.a046;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SumOfLikePowersSequence;
import irvine.oeis.a047.A047725;

/**
 * A046045 Sum of 14 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A046045 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A046045() {
    super(new A047725(), new SumOfLikePowersSequence(4, 1, 13, false));
  }
}
