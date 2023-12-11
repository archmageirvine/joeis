package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021589 Decimal expansion of 1/585.
 * @author Sean A. Irvine
 */
public class A021589 extends PrependSequence {

  /** Construct the sequence. */
  public A021589() {
    super(new PeriodicSequence(0, 1, 7, 0, 9, 4), 0);
  }
}

