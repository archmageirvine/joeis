package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021278 Decimal expansion of 1/274.
 * @author Sean A. Irvine
 */
public class A021278 extends PrependSequence {

  /** Construct the sequence. */
  public A021278() {
    super(new PeriodicSequence(0, 3, 6, 4, 9, 6, 3, 5), 0);
  }
}
