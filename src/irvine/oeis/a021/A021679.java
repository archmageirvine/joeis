package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021679.
 * @author Sean A. Irvine
 */
public class A021679 extends PrependSequence {

  /** Construct the sequence. */
  public A021679() {
    super(new PeriodicSequence(1, 4, 8), 0, 0);
  }
}

