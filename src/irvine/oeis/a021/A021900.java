package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021900 Decimal expansion of 1/896.
 * @author Sean A. Irvine
 */
public class A021900 extends PrependSequence {

  /** Construct the sequence. */
  public A021900() {
    super(new PeriodicSequence(7, 1, 4, 2, 8, 5), 0, 0, 1, 1, 1, 6, 0);
  }
}

