package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133335 <code>a(3*n) = 3*a(3*n-1)-3*a(3*n-2)+2*a(3*n-3), a(3*n+1) = 3*a(3*n)-3*a(3*n-1)+2*a(3*n-2), a(3*n+2) = 3*a(3*n+1)-3*a(3*n)</code> with <code>a(0)=1, a(1)=2, a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A133335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133335() {
    super(new long[] {5, 0, 0}, new long[] {1, 2, 3});
  }
}
