package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090041 <code>a(n)=10a(n-1)-20a(n-2), a(0)=1, a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A090041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090041() {
    super(new long[] {-20, 10}, new long[] {1, 6});
  }
}
