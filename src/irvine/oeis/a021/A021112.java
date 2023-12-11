package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021112 Decimal expansion of 1/108.
 * @author Sean A. Irvine
 */
public class A021112 extends PrependSequence {

  /** Construct the sequence. */
  public A021112() {
    super(new PeriodicSequence(9, 2, 5), 0, 0);
  }
}
