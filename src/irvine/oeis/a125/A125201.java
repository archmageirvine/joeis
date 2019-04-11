package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125201 <code>a(n) = 8*n^2 - 7*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A125201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125201() {
    super(new long[] {1, -3, 3}, new long[] {2, 19, 52});
  }
}
