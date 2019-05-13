package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021939 Decimal expansion of 1/935.
 * @author Sean A. Irvine
 */
public class A021939 extends PrependSequence {

  /** Construct the sequence. */
  public A021939() {
    super(new PeriodicSequence(0, 1, 0, 6, 9, 5, 1, 8, 7, 1, 6, 5, 7, 7, 5, 4), 0);
  }
}

