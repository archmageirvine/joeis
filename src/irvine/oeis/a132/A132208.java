package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132208 a(n) = 15n(n+1) + 11.
 * @author Sean A. Irvine
 */
public class A132208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132208() {
    super(new long[] {1, -3, 3}, new long[] {11, 41, 101});
  }
}
