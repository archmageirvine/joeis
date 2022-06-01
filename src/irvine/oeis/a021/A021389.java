package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021389 Decimal expansion of 1/385.
 * @author Sean A. Irvine
 */
public class A021389 extends PrependSequence {

  /** Construct the sequence. */
  public A021389() {
    super(new PeriodicSequence(0, 2, 5, 9, 7, 4), 0);
  }
}
