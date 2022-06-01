package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084134 a(n)=8a(n-1)-6a(n-2), a(0)=1,a(1)=4.
 * @author Sean A. Irvine
 */
public class A084134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084134() {
    super(new long[] {-6, 8}, new long[] {1, 4});
  }
}
