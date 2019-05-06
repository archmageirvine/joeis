package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021036 Decimal expansion of 1/32.
 * @author Sean A. Irvine
 */
public class A021036 extends PrependSequence {

  /** Construct the sequence. */
  public A021036() {
    super(new PeriodicSequence(0), 0, 3, 1, 2, 5);
  }
}
