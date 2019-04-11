package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014935 <code>a(1)=1, a(n)=n*18^(n-1)+a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014935() {
    super(new long[] {324, -360, 37}, new long[] {1, 37, 1009});
  }
}
