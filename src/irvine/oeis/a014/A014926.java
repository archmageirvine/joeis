package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014926 <code>a(1)=1, a(n) = n*11^(n-1) + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014926() {
    super(new long[] {121, -143, 23}, new long[] {1, 23, 386});
  }
}
