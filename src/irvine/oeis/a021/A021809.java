package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021809 Decimal expansion of 1/805.
 * @author Sean A. Irvine
 */
public class A021809 extends PrependSequence {

  /** Construct the sequence. */
  public A021809() {
    super(new PeriodicSequence(0, 1, 2, 4, 2, 2, 3, 6, 0, 2, 4, 8, 4, 4, 7, 2, 0, 4, 9, 6, 8, 9, 4, 4, 0, 9, 9, 3, 7, 8, 8, 8, 1, 9, 8, 7, 5, 7, 7, 6, 3, 9, 7, 5, 1, 5, 5, 2, 7, 9, 5, 0, 3, 1, 0, 5, 5, 9, 0, 0, 6, 2, 1, 1, 1, 8), 0);
  }
}

