package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021966 Decimal expansion of 1/962.
 * @author Sean A. Irvine
 */
public class A021966 extends PrependSequence {

  /** Construct the sequence. */
  public A021966() {
    super(new PeriodicSequence(0, 1, 0, 3, 9, 5), 0);
  }
}

