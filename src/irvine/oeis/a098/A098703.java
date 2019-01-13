package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098703.
 * @author Sean A. Irvine
 */
public class A098703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098703() {
    super(new long[] {-3, -2, 4}, new long[] {0, 1, 2});
  }
}
