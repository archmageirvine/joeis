package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021212 Decimal expansion of 1/208.
 * @author Sean A. Irvine
 */
public class A021212 extends PrependSequence {

  /** Construct the sequence. */
  public A021212() {
    super(new PeriodicSequence(0, 7, 6, 9, 2, 3), 0, 0, 4, 8);
  }
}
