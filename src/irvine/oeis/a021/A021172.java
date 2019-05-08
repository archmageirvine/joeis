package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021172.
 * @author Sean A. Irvine
 */
public class A021172 extends PrependSequence {

  /** Construct the sequence. */
  public A021172() {
    super(new PeriodicSequence(9, 5, 2, 3, 8, 0), 0, 0, 5);
  }
}
