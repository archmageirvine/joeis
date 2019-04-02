package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137399 a(n)=4a(n-4).
 * @author Sean A. Irvine
 */
public class A137399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137399() {
    super(new long[] {4, 0, 0, 0}, new long[] {1, 2, 2, 1});
  }
}
