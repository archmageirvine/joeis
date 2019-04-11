package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056918 <code>a(n) = 9*a(n-1)-a(n-2)</code>; <code>a(0)=2, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A056918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056918() {
    super(new long[] {-1, 9}, new long[] {2, 9});
  }
}
