package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021639.
 * @author Sean A. Irvine
 */
public class A021639 extends PrependSequence {

  /** Construct the sequence. */
  public A021639() {
    super(new PeriodicSequence(0, 1, 5, 7, 4, 8, 0, 3, 1, 4, 9, 6, 0, 6, 2, 9, 9, 2, 1, 2, 5, 9, 8, 4, 2, 5, 1, 9, 6, 8, 5, 0, 3, 9, 3, 7, 0, 0, 7, 8, 7, 4), 0);
  }
}

