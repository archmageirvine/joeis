package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186194.
 * @author Sean A. Irvine
 */
public class A186194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186194() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 2, 132});
  }
}
