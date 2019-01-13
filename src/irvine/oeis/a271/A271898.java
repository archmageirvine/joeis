package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271898.
 * @author Sean A. Irvine
 */
public class A271898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271898() {
    super(new long[] {4, -5, 4}, new long[] {1, 4, 12});
  }
}
