package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055271 <code>a(n) = 5*a(n-1) - a(n-2)</code> with <code>a(0)=1, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A055271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055271() {
    super(new long[] {-1, 5}, new long[] {1, 7});
  }
}
