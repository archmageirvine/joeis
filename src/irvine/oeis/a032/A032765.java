package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032765 Floor(n(n+1)(n+2) / (n+ n+1 + n+2)), which equals floor(n(n + 2)/3).
 * @author Sean A. Irvine
 */
public class A032765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032765() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 2, 5, 8});
  }
}
