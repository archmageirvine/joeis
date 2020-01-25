package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056124 <code>a(n) = 3*a(n-1) - a(n-2) + 8</code> with <code>a(0)=1, a(1)=11</code>.
 * @author Sean A. Irvine
 */
public class A056124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056124() {
    super(new long[] {1, -4, 4}, new long[] {1, 11, 40});
  }
}
