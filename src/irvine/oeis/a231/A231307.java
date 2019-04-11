package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231307 Recurrence <code>a(n) = a(n-2) +</code> n^M for M=8, starting with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A231307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231307() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 256, 6562, 65792, 397187, 1745408, 6161988, 18522624, 49208709});
  }
}
