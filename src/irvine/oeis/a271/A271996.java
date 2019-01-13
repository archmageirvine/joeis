package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271996.
 * @author Sean A. Irvine
 */
public class A271996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271996() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {6, 14, 32, 50, 82, 114});
  }
}
