package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

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
