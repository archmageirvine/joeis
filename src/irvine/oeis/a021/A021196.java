package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021196 Decimal expansion of 1/192.
 * @author Sean A. Irvine
 */
public class A021196 extends PrependSequence {

  /** Construct the sequence. */
  public A021196() {
    super(new PeriodicSequence(3), 0, 0, 5, 2, 0, 8);
  }
}
