package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021696.
 * @author Sean A. Irvine
 */
public class A021696 extends PrependSequence {

  /** Construct the sequence. */
  public A021696() {
    super(new PeriodicSequence(1, 4, 4, 5, 0, 8, 6, 7, 0, 5, 2, 0, 2, 3, 1, 2, 1, 3, 8, 7, 2, 8, 3, 2, 3, 6, 9, 9, 4, 2, 1, 9, 6, 5, 3, 1, 7, 9, 1, 9, 0, 7, 5), 0, 0);
  }
}

