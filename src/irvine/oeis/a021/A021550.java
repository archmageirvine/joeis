package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021550 Decimal expansion of 1/546.
 * @author Sean A. Irvine
 */
public class A021550 extends PrependSequence {

  /** Construct the sequence. */
  public A021550() {
    super(new PeriodicSequence(0, 1, 8, 3, 1, 5), 0);
  }
}
