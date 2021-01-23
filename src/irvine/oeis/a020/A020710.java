package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020710 n+5.
 * @author Sean A. Irvine
 */
public class A020710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020710() {
    super(new long[] {-1, 2}, new long[] {5, 6});
  }
}
