package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021968.
 * @author Sean A. Irvine
 */
public class A021968 extends PrependSequence {

  /** Construct the sequence. */
  public A021968() {
    super(new PeriodicSequence(1, 0, 3, 7, 3, 4, 4, 3, 9, 8, 3, 4, 0, 2, 4, 8, 9, 6, 2, 6, 5, 5, 6, 0, 1, 6, 5, 9, 7, 5), 0, 0);
  }
}

