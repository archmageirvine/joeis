package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154244 a(n) = 6*a(n-1) - 2*a(n-2) for n&gt;1; a(1)=1, a(2)=6.
 * @author Sean A. Irvine
 */
public class A154244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154244() {
    super(new long[] {-2, 6}, new long[] {1, 6});
  }
}
