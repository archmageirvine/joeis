package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021598.
 * @author Sean A. Irvine
 */
public class A021598 extends PrependSequence {

  /** Construct the sequence. */
  public A021598() {
    super(new PeriodicSequence(0, 1, 6, 8, 3, 5), 0);
  }
}

