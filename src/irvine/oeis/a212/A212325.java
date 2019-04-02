package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212325 Prime-generating polynomial: n^2 + 3*n - 167.
 * @author Sean A. Irvine
 */
public class A212325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212325() {
    super(new long[] {1, -3, 3}, new long[] {-167, -163, -157});
  }
}
