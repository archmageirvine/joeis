package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021858 Decimal expansion of 1/854.
 * @author Sean A. Irvine
 */
public class A021858 extends PrependSequence {

  /** Construct the sequence. */
  public A021858() {
    super(new PeriodicSequence(0, 1, 1, 7, 0, 9, 6, 0, 1, 8, 7, 3, 5, 3, 6, 2, 9, 9, 7, 6, 5, 8, 0, 7, 9, 6, 2, 5, 2, 9, 2, 7, 4, 0, 0, 4, 6, 8, 3, 8, 4, 0, 7, 4, 9, 4, 1, 4, 5, 1, 9, 9, 0, 6, 3, 2, 3, 1, 8, 5), 0);
  }
}

