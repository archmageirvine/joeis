package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099273.
 * @author Sean A. Irvine
 */
public class A099273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099273() {
    super(new long[] {-1, 16, 16}, new long[] {0, 1, 15});
  }
}
