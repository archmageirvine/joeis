package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099781.
 * @author Sean A. Irvine
 */
public class A099781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099781() {
    super(new long[] {1, -16, 8}, new long[] {1, 4, 16});
  }
}
