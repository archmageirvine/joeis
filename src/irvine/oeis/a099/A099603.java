package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099603.
 * @author Sean A. Irvine
 */
public class A099603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099603() {
    super(new long[] {-4, 0, 6, 0}, new long[] {1, 2, 4, 12});
  }
}
