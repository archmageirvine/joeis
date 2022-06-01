package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021799 Decimal expansion of 1/795.
 * @author Sean A. Irvine
 */
public class A021799 extends PrependSequence {

  /** Construct the sequence. */
  public A021799() {
    super(new PeriodicSequence(0, 1, 2, 5, 7, 8, 6, 1, 6, 3, 5, 2, 2), 0);
  }
}

