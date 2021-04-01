package irvine.oeis.a046;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SumOfLikePowersSequence;

/**
 * A046046 Sum of 15 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A046046 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A046046() {
    super(new SumOfLikePowersSequence(4, 15, 15, false), new SumOfLikePowersSequence(4, 1, 14, false));
  }
}
