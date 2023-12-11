package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021292 Decimal expansion of 1/288.
 * @author Sean A. Irvine
 */
public class A021292 extends PrependSequence {

  /** Construct the sequence. */
  public A021292() {
    super(new PeriodicSequence(2), 0, 0, 3, 4, 7);
  }
}
