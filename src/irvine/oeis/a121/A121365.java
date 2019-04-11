package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121365 <code>a(n) = 6*a(n-1) - 9*a(n-2) + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A121365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121365() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 1, 1, 2});
  }
}
