package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021520.
 * @author Sean A. Irvine
 */
public class A021520 extends PrependSequence {

  /** Construct the sequence. */
  public A021520() {
    super(new PeriodicSequence(1, 9, 3, 7, 9, 8, 4, 4, 9, 6, 1, 2, 4, 0, 3, 1, 0, 0, 7, 7, 5), 0, 0);
  }
}
