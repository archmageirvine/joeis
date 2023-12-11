package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021030 Decimal expansion of 1/26.
 * @author Sean A. Irvine
 */
public class A021030 extends PrependSequence {

  /** Construct the sequence. */
  public A021030() {
    super(new PeriodicSequence(3, 8, 4, 6, 1, 5), 0);
  }
}
