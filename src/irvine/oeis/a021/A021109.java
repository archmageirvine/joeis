package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021109 Decimal expansion of 1/105.
 * @author Sean A. Irvine
 */
public class A021109 extends PrependSequence {

  /** Construct the sequence. */
  public A021109() {
    super(new PeriodicSequence(0, 9, 5, 2, 3, 8), 0);
  }
}
