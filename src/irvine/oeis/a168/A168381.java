package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168381.
 * @author Sean A. Irvine
 */
public class A168381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168381() {
    super(new long[] {-1, 1, 1}, new long[] {2, 10, 10});
  }
}
