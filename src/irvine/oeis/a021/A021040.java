package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021040 Decimal expansion of 1/36.
 * @author Sean A. Irvine
 */
public class A021040 extends PrependSequence {

  /** Construct the sequence. */
  public A021040() {
    super(new PeriodicSequence(7), 0, 2);
  }
}
