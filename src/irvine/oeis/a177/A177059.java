package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177059.
 * @author Sean A. Irvine
 */
public class A177059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177059() {
    super(new long[] {1, -3, 3}, new long[] {6, 56, 156});
  }
}
