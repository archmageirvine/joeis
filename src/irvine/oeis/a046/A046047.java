package irvine.oeis.a046;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SumOfLikePowersSequence;

/**
 * A046047 Sum of 16 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A046047 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A046047() {
    super(new SumOfLikePowersSequence(4, 16, 16, false), new SumOfLikePowersSequence(4, 1, 15, false));
  }
}
