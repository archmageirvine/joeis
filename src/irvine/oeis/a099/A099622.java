package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099622.
 * @author Sean A. Irvine
 */
public class A099622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099622() {
    super(new long[] {-20, -11, 8}, new long[] {0, 1, 8});
  }
}
