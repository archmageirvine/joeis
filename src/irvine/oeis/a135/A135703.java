package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135703.
 * @author Sean A. Irvine
 */
public class A135703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135703() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 24});
  }
}
