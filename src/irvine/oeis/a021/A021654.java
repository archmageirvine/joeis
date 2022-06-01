package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021654 Decimal expansion of 1/650.
 * @author Sean A. Irvine
 */
public class A021654 extends PrependSequence {

  /** Construct the sequence. */
  public A021654() {
    super(new PeriodicSequence(1, 5, 3, 8, 4, 6), 0, 0);
  }
}

