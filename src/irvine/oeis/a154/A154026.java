package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154026 <code>a(n+2) = 81*a(n+1) - a(n), a(1)=0, a(2)=9</code>.
 * @author Sean A. Irvine
 */
public class A154026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154026() {
    super(new long[] {-1, 81}, new long[] {0, 9});
  }
}
