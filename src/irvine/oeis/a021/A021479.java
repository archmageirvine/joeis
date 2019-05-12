package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021479.
 * @author Sean A. Irvine
 */
public class A021479 extends PrependSequence {

  /** Construct the sequence. */
  public A021479() {
    super(new PeriodicSequence(2, 1, 0, 5, 2, 6, 3, 1, 5, 7, 8, 9, 4, 7, 3, 6, 8, 4), 0, 0);
  }
}
