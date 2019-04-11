package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053602 <code>a(n) = a(n-1) - (-1)^n*a(n-2), a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A053602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053602() {
    super(new long[] {1, 0, 1, 0}, new long[] {0, 1, 1, 2});
  }
}
