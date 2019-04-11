package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215636 <code>a(n) = - 12*a(n-1) - 54*a(n-2) - 112*a(n-3) - 105*a(n-4) - 36*a(n-5) - 2*a(n-6)</code> with <code>a(0)=a(1)=a(2)=0, a(3)=-3, a(4)=24, a(5)=-135</code>.
 * @author Sean A. Irvine
 */
public class A215636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215636() {
    super(new long[] {-2, -36, -105, -112, -54, -12}, new long[] {0, 0, 0, -3, 24, -135});
  }
}
