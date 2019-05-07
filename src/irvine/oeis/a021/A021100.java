package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021100.
 * @author Sean A. Irvine
 */
public class A021100 extends PrependSequence {

  /** Construct the sequence. */
  public A021100() {
    super(new PeriodicSequence(6), 0, 1, 0, 4, 1);
  }
}
