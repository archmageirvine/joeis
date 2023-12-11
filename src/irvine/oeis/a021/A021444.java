package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021444 Decimal expansion of 1/440.
 * @author Sean A. Irvine
 */
public class A021444 extends PrependSequence {

  /** Construct the sequence. */
  public A021444() {
    super(new PeriodicSequence(2, 7), 0, 0, 2);
  }
}
