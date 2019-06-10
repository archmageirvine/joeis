package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055588 <code>a(n) = 3*a(n-1) - a(n-2) - 1</code> with <code>a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A055588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055588() {
    super(new long[] {1, -4, 4}, new long[] {1, 2, 4});
  }
}
