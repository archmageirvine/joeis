package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185788.
 * @author Sean A. Irvine
 */
public class A185788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185788() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 12, 37});
  }
}
