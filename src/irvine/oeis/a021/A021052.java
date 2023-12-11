package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021052 Decimal expansion of 1/48.
 * @author Sean A. Irvine
 */
public class A021052 extends PrependSequence {

  /** Construct the sequence. */
  public A021052() {
    super(new PeriodicSequence(3), 0, 2, 0, 8);
  }
}
