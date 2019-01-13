package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005320.
 * @author Sean A. Irvine
 */
public class A005320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005320() {
    super(new long[] {-1, 4}, new long[] {0, 3});
  }
}
