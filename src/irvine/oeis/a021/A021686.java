package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021686.
 * @author Sean A. Irvine
 */
public class A021686 extends PrependSequence {

  /** Construct the sequence. */
  public A021686() {
    super(new PeriodicSequence(0, 1, 4, 6, 6, 2, 7, 5, 6, 5, 9, 8, 2, 4, 0, 4, 6, 9, 2, 0, 8, 2, 1, 1, 1, 4, 3, 6, 9, 5), 0);
  }
}

