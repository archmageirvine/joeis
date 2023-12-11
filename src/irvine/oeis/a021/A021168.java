package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021168 Decimal expansion of 1/164.
 * @author Sean A. Irvine
 */
public class A021168 extends PrependSequence {

  /** Construct the sequence. */
  public A021168() {
    super(new PeriodicSequence(6, 0, 9, 7, 5), 0, 0);
  }
}
