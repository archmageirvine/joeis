package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021580.
 * @author Sean A. Irvine
 */
public class A021580 extends PrependSequence {

  /** Construct the sequence. */
  public A021580() {
    super(new PeriodicSequence(1), 0, 0, 1, 7, 3, 6);
  }
}
