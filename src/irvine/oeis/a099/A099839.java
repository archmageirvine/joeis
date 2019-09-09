package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099839 <code>a(0) = 1, a(1) = -11</code> and <code>a(n) = -10*a(n-1) - 5*a(n-2), n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A099839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099839() {
    super(new long[] {-5, -10}, new long[] {1, -11});
  }
}
