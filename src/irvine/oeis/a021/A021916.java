package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021916 Decimal expansion of 1/912.
 * @author Sean A. Irvine
 */
public class A021916 extends PrependSequence {

  /** Construct the sequence. */
  public A021916() {
    super(new PeriodicSequence(9, 6, 4, 9, 1, 2, 2, 8, 0, 7, 0, 1, 7, 5, 4, 3, 8, 5), 0, 0, 1, 0);
  }
}

