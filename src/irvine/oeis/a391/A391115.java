package irvine.oeis.a391;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a036.A036967;
import irvine.oeis.a046.A046101;

/**
 * A391115 Numbers that are neither 4-free nor 4-full.
 * @author Sean A. Irvine
 */
public class A391115 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A391115() {
    super(1, new A046101(), new A036967());
  }
}
