package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021949 Decimal expansion of 1/945.
 * @author Sean A. Irvine
 */
public class A021949 extends PrependSequence {

  /** Construct the sequence. */
  public A021949() {
    super(new PeriodicSequence(0, 1, 0, 5, 8, 2), 0);
  }
}

