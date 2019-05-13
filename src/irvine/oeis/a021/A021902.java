package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021902.
 * @author Sean A. Irvine
 */
public class A021902 extends PrependSequence {

  /** Construct the sequence. */
  public A021902() {
    super(new PeriodicSequence(0, 1, 1, 1, 3, 5, 8, 5, 7, 4, 6, 1, 0, 2, 4, 4, 9, 8, 8, 8, 6, 4, 1, 4, 2, 5, 3, 8, 9, 7, 5, 5), 0);
  }
}

