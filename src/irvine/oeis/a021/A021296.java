package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021296 Decimal expansion of 1/292.
 * @author Sean A. Irvine
 */
public class A021296 extends PrependSequence {

  /** Construct the sequence. */
  public A021296() {
    super(new PeriodicSequence(3, 4, 2, 4, 6, 5, 7, 5), 0, 0);
  }
}
