package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021688.
 * @author Sean A. Irvine
 */
public class A021688 extends PrependSequence {

  /** Construct the sequence. */
  public A021688() {
    super(new PeriodicSequence(1, 4, 6, 1, 9, 8, 8, 3, 0, 4, 0, 9, 3, 5, 6, 7, 2, 5), 0, 0);
  }
}

