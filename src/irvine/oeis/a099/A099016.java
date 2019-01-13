package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099016.
 * @author Sean A. Irvine
 */
public class A099016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099016() {
    super(new long[] {-1, 2, 2}, new long[] {1, 2, 4});
  }
}
