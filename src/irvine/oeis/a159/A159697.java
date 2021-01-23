package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159697 a(0)=9, a(n) = 2*a(n-1) + 2^(n-1) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A159697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159697() {
    super(new long[] {-4, 4}, new long[] {9, 19});
  }
}
