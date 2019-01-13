package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099094.
 * @author Sean A. Irvine
 */
public class A099094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099094() {
    super(new long[] {3, 3, 0}, new long[] {1, 0, 3});
  }
}
