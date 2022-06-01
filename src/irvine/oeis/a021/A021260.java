package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021260 Decimal expansion of 1/256.
 * @author Sean A. Irvine
 */
public class A021260 extends PrependSequence {

  /** Construct the sequence. */
  public A021260() {
    super(new PeriodicSequence(0), 0, 0, 3, 9, 0, 6, 2, 5);
  }
}
