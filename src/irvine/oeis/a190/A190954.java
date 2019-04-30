package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190954 <code>a(n) = 10*a(n-1) + 4*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190954() {
    super(new long[] {4, 10}, new long[] {0, 1});
  }
}
