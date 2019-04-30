package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190953 <code>a(n) = 8*a(n-1) + 10*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190953() {
    super(new long[] {10, 8}, new long[] {0, 1});
  }
}
