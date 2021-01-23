package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199029 9*11^n-1.
 * @author Sean A. Irvine
 */
public class A199029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199029() {
    super(new long[] {-11, 12}, new long[] {8, 98});
  }
}
