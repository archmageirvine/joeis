package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021940 Decimal expansion of 1/936.
 * @author Sean A. Irvine
 */
public class A021940 extends PrependSequence {

  /** Construct the sequence. */
  public A021940() {
    super(new PeriodicSequence(0, 6, 8, 3, 7, 6), 0, 0, 1);
  }
}

