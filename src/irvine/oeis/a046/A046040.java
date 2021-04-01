package irvine.oeis.a046;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SumOfLikePowersSequence;
import irvine.oeis.a003.A003329;

/**
 * A046040 Numbers that are the sum of 6 but no fewer positive cubes.
 * @author Sean A. Irvine
 */
public class A046040 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A046040() {
    super(new A003329(), new SumOfLikePowersSequence(3, 1, 5, false));
  }
}  
