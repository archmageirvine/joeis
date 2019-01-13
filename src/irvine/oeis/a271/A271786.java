package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271786.
 * @author Sean A. Irvine
 */
public class A271786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271786() {
    super(new long[] {-1, -2, 1, 2}, new long[] {2, 10, 18, 38});
  }
}
