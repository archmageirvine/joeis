package irvine.oeis.a046;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SumOfLikePowersSequence;
import irvine.oeis.a047.A047724;

/**
 * A046044 Sum of 13 but no fewer nonzero fourth powers.
 * @author Sean A. Irvine
 */
public class A046044 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A046044() {
    super(new A047724(), new SumOfLikePowersSequence(4, 1, 12, false));
  }
}
