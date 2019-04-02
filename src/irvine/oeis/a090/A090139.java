package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090139 a(n)=10a(n-1)-20a(n-2), a(0)=1,a(1)=5.
 * @author Sean A. Irvine
 */
public class A090139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090139() {
    super(new long[] {-20, 10}, new long[] {1, 5});
  }
}
