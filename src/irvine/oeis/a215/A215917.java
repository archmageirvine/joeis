package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215917 <code>a(n) = -3*a(n-1) + a(n-3)</code>, with <code>a(0)=0, a(1)=6</code>, and <code>a(2)=-15</code>.
 * @author Sean A. Irvine
 */
public class A215917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215917() {
    super(new long[] {1, 0, -3}, new long[] {0, 6, -15});
  }
}
