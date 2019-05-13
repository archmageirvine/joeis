package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021988.
 * @author Sean A. Irvine
 */
public class A021988 extends PrependSequence {

  /** Construct the sequence. */
  public A021988() {
    super(new PeriodicSequence(0, 1, 6, 2, 6), 0, 0, 1);
  }
}

