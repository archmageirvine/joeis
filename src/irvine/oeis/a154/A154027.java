package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154027.
 * @author Sean A. Irvine
 */
public class A154027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154027() {
    super(new long[] {-1, 100}, new long[] {0, 10});
  }
}
