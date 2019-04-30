package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213397 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and 2*w <code>&gt;= |x+y-z|</code>.
 * @author Sean A. Irvine
 */
public class A213397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213397() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 5, 18, 43, 83, 144});
  }
}
