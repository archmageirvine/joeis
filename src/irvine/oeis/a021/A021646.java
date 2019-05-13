package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021646 Decimal expansion of 1/642.
 * @author Sean A. Irvine
 */
public class A021646 extends PrependSequence {

  /** Construct the sequence. */
  public A021646() {
    super(new PeriodicSequence(0, 1, 5, 5, 7, 6, 3, 2, 3, 9, 8, 7, 5, 3, 8, 9, 4, 0, 8, 0, 9, 9, 6, 8, 8, 4, 7, 3, 5, 2, 0, 2, 4, 9, 2, 2, 1, 1, 8, 3, 8, 0, 0, 6, 2, 3, 0, 5, 2, 9, 5, 9, 5), 0);
  }
}

