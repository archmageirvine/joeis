package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021556.
 * @author Sean A. Irvine
 */
public class A021556 extends PrependSequence {

  /** Construct the sequence. */
  public A021556() {
    super(new PeriodicSequence(8, 1, 1, 5, 9, 4, 2, 0, 2, 8, 9, 8, 5, 5, 0, 7, 2, 4, 6, 3, 7, 6), 0, 0, 1);
  }
}
