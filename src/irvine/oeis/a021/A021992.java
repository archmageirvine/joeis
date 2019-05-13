package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021992 Decimal expansion of 1/988.
 * @author Sean A. Irvine
 */
public class A021992 extends PrependSequence {

  /** Construct the sequence. */
  public A021992() {
    super(new PeriodicSequence(1, 0, 1, 2, 1, 4, 5, 7, 4, 8, 9, 8, 7, 8, 5, 4, 2, 5), 0, 0);
  }
}

