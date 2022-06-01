package irvine.oeis.a231;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A231307 Recurrence a(n) = a(n-2) + n^M for M=8, starting with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A231307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231307() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 256, 6562, 65792, 397187, 1745408, 6161988, 18522624, 49208709});
  }
}
