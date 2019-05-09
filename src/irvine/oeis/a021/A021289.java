package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021289.
 * @author Sean A. Irvine
 */
public class A021289 extends PrependSequence {

  /** Construct the sequence. */
  public A021289() {
    super(new PeriodicSequence(0, 3, 5, 0, 8, 7, 7, 1, 9, 2, 9, 8, 2, 4, 5, 6, 1, 4), 0);
  }
}
