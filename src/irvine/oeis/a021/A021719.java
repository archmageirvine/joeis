package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021719 Decimal expansion of 1/715.
 * @author Sean A. Irvine
 */
public class A021719 extends PrependSequence {

  /** Construct the sequence. */
  public A021719() {
    super(new PeriodicSequence(0, 1, 3, 9, 8, 6), 0);
  }
}

