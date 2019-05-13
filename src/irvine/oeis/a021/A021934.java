package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021934.
 * @author Sean A. Irvine
 */
public class A021934 extends PrependSequence {

  /** Construct the sequence. */
  public A021934() {
    super(new PeriodicSequence(0, 1, 0, 7, 5, 2, 6, 8, 8, 1, 7, 2, 0, 4, 3), 0);
  }
}

