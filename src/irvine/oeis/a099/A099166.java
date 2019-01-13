package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099166.
 * @author Sean A. Irvine
 */
public class A099166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099166() {
    super(new long[] {-2, -1, 3}, new long[] {1, 3, 9});
  }
}
