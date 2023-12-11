package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021172 Decimal expansion of 1/168.
 * @author Sean A. Irvine
 */
public class A021172 extends PrependSequence {

  /** Construct the sequence. */
  public A021172() {
    super(new PeriodicSequence(9, 5, 2, 3, 8, 0), 0, 0, 5);
  }
}
