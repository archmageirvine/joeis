package irvine.oeis.a386;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A386523 Decimal expansion of 577/408.
 * @author Sean A. Irvine
 */
public class A386523 extends PrependSequence {

  /** Construct the sequence. */
  public A386523() {
    super(1, new PeriodicSequence(2, 1, 5, 6, 8, 6, 2, 7, 4, 5, 0, 9, 8, 0, 3, 9), 1, 4, 1, 4);
  }
}

