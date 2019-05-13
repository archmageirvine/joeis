package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021972.
 * @author Sean A. Irvine
 */
public class A021972 extends PrependSequence {

  /** Construct the sequence. */
  public A021972() {
    super(new PeriodicSequence(0, 3, 3, 0, 5, 7, 8, 5, 1, 2, 3, 9, 6, 6, 9, 4, 2, 1, 4, 8, 7, 6), 0, 0, 1);
  }
}

