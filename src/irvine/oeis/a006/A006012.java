package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006012 <code>a(0) = 1, a(1) = 2, a(n) = 4*a(n-1) - 2*a(n-2), n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A006012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006012() {
    super(new long[] {-2, 4}, new long[] {1, 2});
  }
}

