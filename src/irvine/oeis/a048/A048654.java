package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048654 <code>a(n) = 2*a(n-1) + a(n-2); a(0)=1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A048654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048654() {
    super(new long[] {1, 2}, new long[] {1, 4});
  }
}
