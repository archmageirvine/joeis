package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021652 Decimal expansion of 1/648.
 * @author Sean A. Irvine
 */
public class A021652 extends PrependSequence {

  /** Construct the sequence. */
  public A021652() {
    super(new PeriodicSequence(5, 4, 3, 2, 0, 9, 8, 7, 6), 0, 0, 1);
  }
}

