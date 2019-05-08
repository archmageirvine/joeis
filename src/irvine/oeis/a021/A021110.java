package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021110.
 * @author Sean A. Irvine
 */
public class A021110 extends PrependSequence {

  /** Construct the sequence. */
  public A021110() {
    super(new PeriodicSequence(0, 9, 4, 3, 3, 9, 6, 2, 2, 6, 4, 1, 5), 0);
  }
}
