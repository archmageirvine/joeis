package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021840 Decimal expansion of 1/836.
 * @author Sean A. Irvine
 */
public class A021840 extends PrependSequence {

  /** Construct the sequence. */
  public A021840() {
    super(new PeriodicSequence(1, 1, 9, 6, 1, 7, 2, 2, 4, 8, 8, 0, 3, 8, 2, 7, 7, 5), 0, 0);
  }
}

