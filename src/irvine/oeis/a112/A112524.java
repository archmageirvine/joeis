package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112524 <code>a(1)=1</code>; <code>a(n) = a(n-1) + 2*n^2</code>.
 * @author Sean A. Irvine
 */
public class A112524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112524() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 27, 59});
  }
}
