package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259861 <code>a(n+8)+34*a(n+4)+a(n)=0</code> with <code>a(0)-a(7)</code> as shown.
 * @author Sean A. Irvine
 */
public class A259861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259861() {
    super(new long[] {-1, 4, -8, 4}, new long[] {2, 2, -5, -29});
  }
}
