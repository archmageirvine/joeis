package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021669.
 * @author Sean A. Irvine
 */
public class A021669 extends PrependSequence {

  /** Construct the sequence. */
  public A021669() {
    super(new PeriodicSequence(0, 1, 5, 0, 3, 7, 5, 9, 3, 9, 8, 4, 9, 6, 2, 4, 0, 6), 0);
  }
}

