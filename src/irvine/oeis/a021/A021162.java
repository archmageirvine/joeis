package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021162 Decimal expansion of 1/158.
 * @author Sean A. Irvine
 */
public class A021162 extends PrependSequence {

  /** Construct the sequence. */
  public A021162() {
    super(new PeriodicSequence(0, 6, 3, 2, 9, 1, 1, 3, 9, 2, 4, 0, 5), 0);
  }
}
