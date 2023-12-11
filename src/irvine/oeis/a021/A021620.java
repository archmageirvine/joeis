package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021620 Decimal expansion of 1/616.
 * @author Sean A. Irvine
 */
public class A021620 extends PrependSequence {

  /** Construct the sequence. */
  public A021620() {
    super(new PeriodicSequence(6, 2, 3, 3, 7, 6), 0, 0, 1);
  }
}

