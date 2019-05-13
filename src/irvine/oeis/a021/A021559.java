package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021559.
 * @author Sean A. Irvine
 */
public class A021559 extends PrependSequence {

  /** Construct the sequence. */
  public A021559() {
    super(new PeriodicSequence(1, 8, 0), 0, 0);
  }
}
