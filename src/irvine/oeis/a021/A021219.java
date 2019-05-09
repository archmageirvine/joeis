package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021219 Decimal expansion of 1/215.
 * @author Sean A. Irvine
 */
public class A021219 extends PrependSequence {

  /** Construct the sequence. */
  public A021219() {
    super(new PeriodicSequence(0, 4, 6, 5, 1, 1, 6, 2, 7, 9, 0, 6, 9, 7, 6, 7, 4, 4, 1, 8, 6), 0);
  }
}
