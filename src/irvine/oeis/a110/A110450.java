package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110450 <code>a(n) = n*(n+1)*(n^2+n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A110450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110450() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 21, 78, 210});
  }
}
