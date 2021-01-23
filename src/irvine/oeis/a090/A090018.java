package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090018 a(n) = 6*a(n-1) + 3*a(n-2) for n &gt; 2, a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A090018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090018() {
    super(new long[] {3, 6}, new long[] {1, 6});
  }
}
