package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021369.
 * @author Sean A. Irvine
 */
public class A021369 extends PrependSequence {

  /** Construct the sequence. */
  public A021369() {
    super(new PeriodicSequence(0, 2, 7, 3, 9, 7, 2, 6), 0);
  }
}
