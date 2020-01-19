package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056123 <code>a(n) = 3*a(n-1) - a(n-2)</code> with <code>a(0)=1, a(1)=11</code>.
 * @author Sean A. Irvine
 */
public class A056123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056123() {
    super(new long[] {-1, 3}, new long[] {1, 11});
  }
}
