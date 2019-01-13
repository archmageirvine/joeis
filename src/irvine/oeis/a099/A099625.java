package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099625.
 * @author Sean A. Irvine
 */
public class A099625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099625() {
    super(new long[] {4, 4, -11, 6}, new long[] {0, 0, 1, 6});
  }
}
