package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021116 Decimal expansion of 1/112.
 * @author Sean A. Irvine
 */
public class A021116 extends PrependSequence {

  /** Construct the sequence. */
  public A021116() {
    super(new PeriodicSequence(2, 8, 5, 7, 1, 4), 0, 0, 8, 9);
  }
}
