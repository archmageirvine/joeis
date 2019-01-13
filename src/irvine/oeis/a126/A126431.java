package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126431.
 * @author Sean A. Irvine
 */
public class A126431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126431() {
    super(new long[] {-100, 20}, new long[] {0, 10});
  }
}
