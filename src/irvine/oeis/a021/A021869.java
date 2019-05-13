package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021869.
 * @author Sean A. Irvine
 */
public class A021869 extends PrependSequence {

  /** Construct the sequence. */
  public A021869() {
    super(new PeriodicSequence(0, 1, 1, 5, 6, 0, 6, 9, 3, 6, 4, 1, 6, 1, 8, 4, 9, 7, 1, 0, 9, 8, 2, 6, 5, 8, 9, 5, 9, 5, 3, 7, 5, 7, 2, 2, 5, 4, 3, 3, 5, 2, 6), 0);
  }
}

