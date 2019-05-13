package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021554.
 * @author Sean A. Irvine
 */
public class A021554 extends PrependSequence {

  /** Construct the sequence. */
  public A021554() {
    super(new PeriodicSequence(1, 8), 0, 0);
  }
}
