package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167821.
 * @author Sean A. Irvine
 */
public class A167821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167821() {
    super(new long[] {-2, -1, 3}, new long[] {0, 0, 2});
  }
}
