package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021130 Decimal expansion of 1/126.
 * @author Sean A. Irvine
 */
public class A021130 extends PrependSequence {

  /** Construct the sequence. */
  public A021130() {
    super(new PeriodicSequence(0, 7, 9, 3, 6, 5), 0);
  }
}
