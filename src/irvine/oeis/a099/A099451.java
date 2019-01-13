package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099451.
 * @author Sean A. Irvine
 */
public class A099451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099451() {
    super(new long[] {-1, 5, -9, 5}, new long[] {1, 5, 17, 45});
  }
}
