package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099035.
 * @author Sean A. Irvine
 */
public class A099035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099035() {
    super(new long[] {4, -8, 5}, new long[] {1, 5, 15});
  }
}
