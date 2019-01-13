package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099942.
 * @author Sean A. Irvine
 */
public class A099942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099942() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 4, 8});
  }
}
