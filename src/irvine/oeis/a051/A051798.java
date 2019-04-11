package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051798 <code>a(n) = (n+1)*(n+2)*(n+3)*(9n+4)/24</code>.
 * @author Sean A. Irvine
 */
public class A051798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051798() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 13, 55, 155, 350});
  }
}
