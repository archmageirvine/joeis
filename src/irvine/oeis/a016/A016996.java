package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016996 a(n) = (7*n + 1)^4.
 * @author Sean A. Irvine
 */
public class A016996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016996() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4096, 50625, 234256, 707281});
  }
}
