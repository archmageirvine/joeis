package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182465 <code>a(n) = 3a(n-1) - 2a(n-2)</code> with <code>a(0)=28</code> and <code>a(1)=70</code>.
 * @author Sean A. Irvine
 */
public class A182465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182465() {
    super(new long[] {-2, 3}, new long[] {28, 70});
  }
}
