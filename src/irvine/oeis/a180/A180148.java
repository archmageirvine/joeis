package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180148 a(n) = 3*a(n-1)+a(n-2) with a(0)=2 and a(1)=5.
 * @author Sean A. Irvine
 */
public class A180148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180148() {
    super(new long[] {1, 3}, new long[] {2, 5});
  }
}
