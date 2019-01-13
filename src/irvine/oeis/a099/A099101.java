package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099101.
 * @author Sean A. Irvine
 */
public class A099101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099101() {
    super(new long[] {1, 6, 5, 0}, new long[] {1, 0, 3, 5});
  }
}
