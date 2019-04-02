package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140730 a(4*n)=5^n, a(4*n+1)=2*5^n, a(4*n+2)=3*5^n, a(4*n+3)=4*5^n.
 * @author Sean A. Irvine
 */
public class A140730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140730() {
    super(new long[] {5, 0, 0, 0}, new long[] {1, 2, 3, 4});
  }
}
