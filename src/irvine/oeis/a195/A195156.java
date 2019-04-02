package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195156 a(n) = (16^n-1)/3.
 * @author Sean A. Irvine
 */
public class A195156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195156() {
    super(new long[] {-16, 17}, new long[] {0, 5});
  }
}
