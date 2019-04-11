package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134987 Third extended Jacobsthal recurrence: <code>a(n)=4a(n-1)-6(n-2)+4a(n-3)-a(n-4)+2a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A134987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134987() {
    super(new long[] {2, -1, 4, -6, 4}, new long[] {0, 0, 0, 0, 1});
  }
}
