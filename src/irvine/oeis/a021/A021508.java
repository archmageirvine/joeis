package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021508 Decimal expansion of 1/504.
 * @author Sean A. Irvine
 */
public class A021508 extends PrependSequence {

  /** Construct the sequence. */
  public A021508() {
    super(new PeriodicSequence(9, 8, 4, 1, 2, 6), 0, 0, 1);
  }
}
