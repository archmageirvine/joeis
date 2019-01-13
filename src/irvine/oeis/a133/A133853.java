package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133853.
 * @author Sean A. Irvine
 */
public class A133853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133853() {
    super(new long[] {-64, 65}, new long[] {0, 1});
  }
}
