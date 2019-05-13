package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

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

