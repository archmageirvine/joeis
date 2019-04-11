package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046691 <code>a(n) = (n^2+5*n-2)/2</code>.
 * @author Sean A. Irvine
 */
public class A046691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046691() {
    super(new long[] {1, -3, 3}, new long[] {-1, 2, 6});
  }
}
