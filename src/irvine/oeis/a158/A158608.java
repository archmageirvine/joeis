package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158608 <code>a(n) = a(n-1) + 16*a(n-2)</code>, starting <code>a(0)=1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A158608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158608() {
    super(new long[] {16, 1}, new long[] {1, 4});
  }
}
