package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021628 Decimal expansion of 1/624.
 * @author Sean A. Irvine
 */
public class A021628 extends PrependSequence {

  /** Construct the sequence. */
  public A021628() {
    super(new PeriodicSequence(0, 2, 5, 6, 4, 1), 0, 0, 1, 6);
  }
}

