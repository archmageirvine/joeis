package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021832 Decimal expansion of 1/828.
 * @author Sean A. Irvine
 */
public class A021832 extends PrependSequence {

  /** Construct the sequence. */
  public A021832() {
    super(new PeriodicSequence(1, 2, 0, 7, 7, 2, 9, 4, 6, 8, 5, 9, 9, 0, 3, 3, 8, 1, 6, 4, 2, 5), 0, 0);
  }
}

