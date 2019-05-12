package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021442.
 * @author Sean A. Irvine
 */
public class A021442 extends PrependSequence {

  /** Construct the sequence. */
  public A021442() {
    super(new PeriodicSequence(0, 2, 2, 8, 3, 1, 0, 5), 0);
  }
}
