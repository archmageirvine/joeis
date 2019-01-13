package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110528.
 * @author Sean A. Irvine
 */
public class A110528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110528() {
    super(new long[] {1, 5, 3}, new long[] {1, 10, 37});
  }
}
