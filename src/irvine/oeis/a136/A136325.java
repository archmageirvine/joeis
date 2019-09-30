package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136325 <code>a(n) = 8*a(n-1)-a(n-2)</code> with <code>a(0)=0</code> and <code>a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A136325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136325() {
    super(new long[] {-1, 8}, new long[] {0, 3});
  }
}
