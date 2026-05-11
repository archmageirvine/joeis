package irvine.oeis.a084;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.a003.A003586;

/**
 * A084788 Sizes of successive increasing gaps between 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A084788 extends RecordSequence {

  /** Construct the sequence. */
  public A084788() {
    super(1, new DifferenceSequence(new A003586()));
  }
}
