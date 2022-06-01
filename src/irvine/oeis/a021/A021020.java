package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021020 Decimal expansion of 1/16.
 * @author Sean A. Irvine
 */
public class A021020 extends PrependSequence {

  /** Construct the sequence. */
  public A021020() {
    super(new PeriodicSequence(0), 0, 6, 2, 5);
  }
}
