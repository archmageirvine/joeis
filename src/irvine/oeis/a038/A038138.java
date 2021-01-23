package irvine.oeis.a038;

import irvine.oeis.PeriodicSequence;

/**
 * A038138 Order of n (mod 7).
 * @author Sean A. Irvine
 */
public class A038138 extends PeriodicSequence {

  /** Construct the sequence. */
  public A038138() {
    super(0, 1, 3, 6, 3, 6, 2);
  }
}
