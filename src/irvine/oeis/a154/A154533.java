package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154533.
 * @author Sean A. Irvine
 */
public class A154533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154533() {
    super(new long[] {1, -3, 3}, new long[] {10, 9, 10});
  }
}
