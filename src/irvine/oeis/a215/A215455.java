package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215455 <code>a(n) = 6*a(n-1) - 9*a(n-2) + a(n-3),</code> with <code>a(0)=3, a(1)=6</code> and <code>a(2)=18</code>.
 * @author Sean A. Irvine
 */
public class A215455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215455() {
    super(new long[] {1, -9, 6}, new long[] {3, 6, 18});
  }
}
