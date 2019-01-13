package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099513.
 * @author Sean A. Irvine
 */
public class A099513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099513() {
    super(new long[] {-1, 7, 1, 2}, new long[] {1, 4, 8, 27});
  }
}
