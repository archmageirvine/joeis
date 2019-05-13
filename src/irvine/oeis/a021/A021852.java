package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021852.
 * @author Sean A. Irvine
 */
public class A021852 extends PrependSequence {

  /** Construct the sequence. */
  public A021852() {
    super(new PeriodicSequence(7, 9, 2, 4, 5, 2, 8, 3, 0, 1, 8, 8, 6), 0, 0, 1, 1);
  }
}

