package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122117 a(0)=1, a(1)=2, a(n)=3*a(n-1)+4*a(n-2) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A122117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122117() {
    super(new long[] {4, 3}, new long[] {1, 2});
  }
}
