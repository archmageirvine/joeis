package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181716 <code>a(n) = a(n-1) + a(n-2) + (-1)^n,</code> with <code>a(0)=0</code> and <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A181716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181716() {
    super(new long[] {1, 2, 0}, new long[] {0, 1, 2});
  }
}
