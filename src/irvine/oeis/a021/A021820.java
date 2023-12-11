package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021820 Decimal expansion of 1/816.
 * @author Sean A. Irvine
 */
public class A021820 extends PrependSequence {

  /** Construct the sequence. */
  public A021820() {
    super(new PeriodicSequence(2, 5, 4, 9, 0, 1, 9, 6, 0, 7, 8, 4, 3, 1, 3, 7), 0, 0, 1, 2);
  }
}

