package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021026 Decimal expansion of 1/22.
 * @author Sean A. Irvine
 */
public class A021026 extends PrependSequence {

  /** Construct the sequence. */
  public A021026() {
    super(new PeriodicSequence(4, 5), 0);
  }
}
