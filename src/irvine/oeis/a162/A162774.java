package irvine.oeis.a162;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002410;

/**
 * A162774 14 together with the first differences of A002410.
 * @author Sean A. Irvine
 */
public class A162774 extends PrependSequence {

  /** Construct the sequence. */
  public A162774() {
    super(new DifferenceSequence(new A002410()), 14);
  }
}
