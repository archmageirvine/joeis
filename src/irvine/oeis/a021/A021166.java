package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021166.
 * @author Sean A. Irvine
 */
public class A021166 extends PrependSequence {

  /** Construct the sequence. */
  public A021166() {
    super(new PeriodicSequence(0, 6, 1, 7, 2, 8, 3, 9, 5), 0);
  }
}
