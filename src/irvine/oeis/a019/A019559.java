package irvine.oeis.a019;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A019559 Period 5: repeat [4, 4, 6, 6, 6].
 * @author Sean A. Irvine
 */
public class A019559 extends PeriodicSequence {

  /** Construct the sequence. */
  public A019559() {
    super(4, 4, 6, 6, 6);
  }
}
