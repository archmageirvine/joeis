package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021070 Decimal expansion of 1/66.
 * @author Sean A. Irvine
 */
public class A021070 extends PrependSequence {

  /** Construct the sequence. */
  public A021070() {
    super(new PeriodicSequence(1, 5), 0);
  }
}
