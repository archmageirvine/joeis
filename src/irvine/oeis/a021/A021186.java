package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021186 Decimal expansion of 1/182.
 * @author Sean A. Irvine
 */
public class A021186 extends PrependSequence {

  /** Construct the sequence. */
  public A021186() {
    super(new PeriodicSequence(0, 5, 4, 9, 4, 5), 0);
  }
}
