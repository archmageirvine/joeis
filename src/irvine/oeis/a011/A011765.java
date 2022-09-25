package irvine.oeis.a011;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A011765 Period 4: repeat [0, 0, 0, 1].
 * @author Sean A. Irvine
 */
public class A011765 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011765() {
    super(0, 0, 0, 1);
    setOffset(1);
  }
}
