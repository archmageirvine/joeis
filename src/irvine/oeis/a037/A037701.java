package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037701.
 * @author Sean A. Irvine
 */
public class A037701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037701() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {1, 12, 123, 1230, 12301});
  }
}
