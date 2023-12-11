package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021996 Decimal expansion of 1/992.
 * @author Sean A. Irvine
 */
public class A021996 extends PrependSequence {

  /** Construct the sequence. */
  public A021996() {
    super(new PeriodicSequence(8, 0, 6, 4, 5, 1, 6, 1, 2, 9, 0, 3, 2, 2, 5), 0, 0, 1, 0, 0);
  }
}

