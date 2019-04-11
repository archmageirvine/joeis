package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060925 <code>a(n) = 2a(n-1) + 3a(n-2), a(0) = 1, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A060925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060925() {
    super(new long[] {3, 2}, new long[] {1, 4});
  }
}
