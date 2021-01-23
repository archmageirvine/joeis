package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140167 a(n) = (-1)*a(n-1) + 3*a(n-2) with a(1)=-1 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A140167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140167() {
    super(new long[] {3, -1}, new long[] {-1, 1});
  }
}
