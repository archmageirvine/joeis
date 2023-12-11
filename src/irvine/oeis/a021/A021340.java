package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021340 Decimal expansion of 1/336.
 * @author Sean A. Irvine
 */
public class A021340 extends PrependSequence {

  /** Construct the sequence. */
  public A021340() {
    super(new PeriodicSequence(7, 6, 1, 9, 0, 4), 0, 0, 2, 9);
  }
}
