package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099504.
 * @author Sean A. Irvine
 */
public class A099504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099504() {
    super(new long[] {-1, 0, 5}, new long[] {1, 5, 25});
  }
}
