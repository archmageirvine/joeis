package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059020.
 * @author Sean A. Irvine
 */
public class A059020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059020() {
    super(new long[] {1, 0, -4, 4}, new long[] {0, 3, 13, 40});
  }
}
