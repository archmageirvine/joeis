package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133632 <code>a(1)=1, a(n)=(p-1)*a(n-1)</code>, if n is even, else <code>a(n)=p*a(n-2)</code>, where <code>p=5</code>.
 * @author Sean A. Irvine
 */
public class A133632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133632() {
    super(new long[] {5, 0}, new long[] {1, 4});
  }
}
