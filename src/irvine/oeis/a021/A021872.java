package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021872 Decimal expansion of 1/868.
 * @author Sean A. Irvine
 */
public class A021872 extends PrependSequence {

  /** Construct the sequence. */
  public A021872() {
    super(new PeriodicSequence(1, 1, 5, 2, 0, 7, 3, 7, 3, 2, 7, 1, 8, 8, 9, 4, 0, 0, 9, 2, 1, 6, 5, 8, 9, 8, 6, 1, 7, 5), 0, 0);
  }
}

