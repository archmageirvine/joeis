package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055267 <code>a(n) = 3a(n-1) - a(n-2); a(0)=1, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A055267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055267() {
    super(new long[] {-1, 3}, new long[] {1, 7});
  }
}
