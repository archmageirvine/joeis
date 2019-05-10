package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021356 Decimal expansion of 1/352.
 * @author Sean A. Irvine
 */
public class A021356 extends PrependSequence {

  /** Construct the sequence. */
  public A021356() {
    super(new PeriodicSequence(0, 9), 0, 0, 2, 8, 4);
  }
}
