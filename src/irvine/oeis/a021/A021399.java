package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021399.
 * @author Sean A. Irvine
 */
public class A021399 extends PrependSequence {

  /** Construct the sequence. */
  public A021399() {
    super(new PeriodicSequence(0, 2, 5, 3, 1, 6, 4, 5, 5, 6, 9, 6, 2), 0);
  }
}
