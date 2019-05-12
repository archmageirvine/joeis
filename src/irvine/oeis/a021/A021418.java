package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021418.
 * @author Sean A. Irvine
 */
public class A021418 extends PrependSequence {

  /** Construct the sequence. */
  public A021418() {
    super(new PeriodicSequence(0, 2, 4, 1, 5, 4, 5, 8, 9, 3, 7, 1, 9, 8, 0, 6, 7, 6, 3, 2, 8, 5), 0);
  }
}
