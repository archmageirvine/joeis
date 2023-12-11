package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021752 Decimal expansion of 1/748.
 * @author Sean A. Irvine
 */
public class A021752 extends PrependSequence {

  /** Construct the sequence. */
  public A021752() {
    super(new PeriodicSequence(1, 3, 3, 6, 8, 9, 8, 3, 9, 5, 7, 2, 1, 9, 2, 5), 0, 0);
  }
}

