package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049347.
 * @author Sean A. Irvine
 */
public class A049347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049347() {
    super(new long[] {-1, -1}, new long[] {1, -1});
  }
}
