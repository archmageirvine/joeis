package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021952 Decimal expansion of 1/948.
 * @author Sean A. Irvine
 */
public class A021952 extends PrependSequence {

  /** Construct the sequence. */
  public A021952() {
    super(new PeriodicSequence(1, 0, 5, 4, 8, 5, 2, 3, 2, 0, 6, 7, 5), 0, 0);
  }
}

