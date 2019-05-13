package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021812 Decimal expansion of 1/808.
 * @author Sean A. Irvine
 */
public class A021812 extends PrependSequence {

  /** Construct the sequence. */
  public A021812() {
    super(new PeriodicSequence(2, 3, 7, 6), 0, 0, 1);
  }
}

