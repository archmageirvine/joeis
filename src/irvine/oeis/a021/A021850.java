package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021850 Decimal expansion of 1/846.
 * @author Sean A. Irvine
 */
public class A021850 extends PrependSequence {

  /** Construct the sequence. */
  public A021850() {
    super(new PeriodicSequence(0, 1, 1, 8, 2, 0, 3, 3, 0, 9, 6, 9, 2, 6, 7, 1, 3, 9, 4, 7, 9, 9, 0, 5, 4, 3, 7, 3, 5, 2, 2, 4, 5, 8, 6, 2, 8, 8, 4, 1, 6, 0, 7, 5, 6, 5), 0);
  }
}

