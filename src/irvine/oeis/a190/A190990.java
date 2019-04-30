package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190990 <code>a(n) = 10*a(n-1) - 8*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190990() {
    super(new long[] {-8, 10}, new long[] {0, 1});
  }
}
