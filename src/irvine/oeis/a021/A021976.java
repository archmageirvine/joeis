package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021976.
 * @author Sean A. Irvine
 */
public class A021976 extends PrependSequence {

  /** Construct the sequence. */
  public A021976() {
    super(new PeriodicSequence(1, 0, 2, 8, 8, 0, 6, 5, 8, 4, 3, 6, 2, 1, 3, 9, 9, 1, 7, 6, 9, 5, 4, 7, 3, 2, 5), 0, 0);
  }
}

