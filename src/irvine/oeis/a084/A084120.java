package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084120 <code>a(n)=6a(n-1)-3a(n-2), a(0)=1,a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A084120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084120() {
    super(new long[] {-3, 6}, new long[] {1, 3});
  }
}
