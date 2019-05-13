package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021538.
 * @author Sean A. Irvine
 */
public class A021538 extends PrependSequence {

  /** Construct the sequence. */
  public A021538() {
    super(new PeriodicSequence(0, 1, 8, 7, 2, 6, 5, 9, 1, 7, 6, 0, 2, 9, 9, 6, 2, 5, 4, 6, 8, 1, 6, 4, 7, 9, 4, 0, 0, 7, 4, 9, 0, 6, 3, 6, 7, 0, 4, 1, 1, 9, 8, 5), 0);
  }
}
