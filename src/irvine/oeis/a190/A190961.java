package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190961 <code>a(n) = 3*a(n-1) - 7*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190961() {
    super(new long[] {-7, 3}, new long[] {0, 1});
  }
}
