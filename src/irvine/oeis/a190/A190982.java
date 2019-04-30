package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190982 <code>a(n) = 9*a(n-1) - 5*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190982() {
    super(new long[] {-5, 9}, new long[] {0, 1});
  }
}
