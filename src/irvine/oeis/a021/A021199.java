package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021199 Decimal expansion of 1/195.
 * @author Sean A. Irvine
 */
public class A021199 extends PrependSequence {

  /** Construct the sequence. */
  public A021199() {
    super(new PeriodicSequence(0, 5, 1, 2, 8, 2), 0);
  }
}
