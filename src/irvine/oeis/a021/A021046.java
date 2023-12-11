package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021046 Decimal expansion of 1/42.
 * @author Sean A. Irvine
 */
public class A021046 extends PrependSequence {

  /** Construct the sequence. */
  public A021046() {
    super(new PeriodicSequence(2, 3, 8, 0, 9, 5), 0);
  }
}
