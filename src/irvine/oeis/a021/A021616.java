package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021616 Decimal expansion of 1/612.
 * @author Sean A. Irvine
 */
public class A021616 extends PrependSequence {

  /** Construct the sequence. */
  public A021616() {
    super(new PeriodicSequence(1, 6, 3, 3, 9, 8, 6, 9, 2, 8, 1, 0, 4, 5, 7, 5), 0, 0);
  }
}

