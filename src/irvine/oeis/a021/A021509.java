package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021509 Decimal expansion of 1/505.
 * @author Sean A. Irvine
 */
public class A021509 extends PrependSequence {

  /** Construct the sequence. */
  public A021509() {
    super(new PeriodicSequence(0, 1, 9, 8), 0);
  }
}
