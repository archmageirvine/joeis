package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021209 Decimal expansion of 1/205.
 * @author Sean A. Irvine
 */
public class A021209 extends PrependSequence {

  /** Construct the sequence. */
  public A021209() {
    super(new PeriodicSequence(0, 4, 8, 7, 8), 0);
  }
}
