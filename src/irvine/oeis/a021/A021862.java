package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021862 Decimal expansion of 1/858.
 * @author Sean A. Irvine
 */
public class A021862 extends PrependSequence {

  /** Construct the sequence. */
  public A021862() {
    super(new PeriodicSequence(0, 1, 1, 6, 5, 5), 0);
  }
}

