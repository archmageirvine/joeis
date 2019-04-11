package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154025 <code>a(n+2) = 64*a(n+1) - a(n), a(1)=0, a(2)=8</code>.
 * @author Sean A. Irvine
 */
public class A154025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154025() {
    super(new long[] {-1, 64}, new long[] {0, 8});
  }
}
