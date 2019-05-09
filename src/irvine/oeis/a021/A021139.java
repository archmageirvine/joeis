package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021139 Decimal expansion of 1/135.
 * @author Sean A. Irvine
 */
public class A021139 extends PrependSequence {

  /** Construct the sequence. */
  public A021139() {
    super(new PeriodicSequence(0, 7, 4), 0);
  }
}
