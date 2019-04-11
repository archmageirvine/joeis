package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076824 Let <code>a(1)=a(2)=1,</code> a(n)=(2^ceiling(a(n-1)/2)+1)/a(n-2).
 * @author Sean A. Irvine
 */
public class A076824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076824() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 3, 5, 3});
  }
}
