package irvine.oeis.a032;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a002.A002808;

/**
 * A032583 Numbers which are neither prime nor lucky.
 * @author Sean A. Irvine
 */
public class A032583 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A032583() {
    super(new A002808(), new A000959());
  }
}
