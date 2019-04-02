package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155672 11^n-9^n+1^n.
 * @author Sean A. Irvine
 */
public class A155672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155672() {
    super(new long[] {99, -119, 21}, new long[] {1, 3, 41});
  }
}
