package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021592.
 * @author Sean A. Irvine
 */
public class A021592 extends PrependSequence {

  /** Construct the sequence. */
  public A021592() {
    super(new PeriodicSequence(1, 7, 0, 0, 6, 8, 0, 2, 7, 2, 1, 0, 8, 8, 4, 3, 5, 3, 7, 4, 1, 4, 9, 6, 5, 9, 8, 6, 3, 9, 4, 5, 5, 7, 8, 2, 3, 1, 2, 9, 2, 5), 0, 0);
  }
}

