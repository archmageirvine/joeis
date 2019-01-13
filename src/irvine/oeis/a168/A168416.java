package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168416.
 * @author Sean A. Irvine
 */
public class A168416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168416() {
    super(new long[] {-1, 1, 1}, new long[] {1, 10, 10});
  }
}
