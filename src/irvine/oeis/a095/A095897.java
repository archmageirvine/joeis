package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095897.
 * @author Sean A. Irvine
 */
public class A095897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095897() {
    super(new long[] {-96, -32, 20, 4}, new long[] {1, 8, 48, 320});
  }
}
