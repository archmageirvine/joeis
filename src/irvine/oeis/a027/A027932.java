package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027932 <code>T(n,2n-9)</code>, T given by A027926.
 * @author Sean A. Irvine
 */
public class A027932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027932() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 3, 8, 21, 55, 143, 364, 894, 2098, 4685});
  }
}
