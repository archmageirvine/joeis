package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021088.
 * @author Sean A. Irvine
 */
public class A021088 extends PrependSequence {

  /** Construct the sequence. */
  public A021088() {
    super(new PeriodicSequence(1, 9, 0, 4, 7, 6), 0, 1);
  }
}
