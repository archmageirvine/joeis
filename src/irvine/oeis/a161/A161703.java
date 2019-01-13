package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161703.
 * @author Sean A. Irvine
 */
public class A161703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161703() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 5, 15});
  }
}
