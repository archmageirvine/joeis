package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021848.
 * @author Sean A. Irvine
 */
public class A021848 extends PrependSequence {

  /** Construct the sequence. */
  public A021848() {
    super(new PeriodicSequence(1, 1, 8, 4, 8, 3, 4, 1, 2, 3, 2, 2, 2, 7, 4, 8, 8, 1, 5, 1, 6, 5, 8, 7, 6, 7, 7, 7, 2, 5), 0, 0);
  }
}

