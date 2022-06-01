package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003229 a(n) = a(n-1) + 2*a(n-3) with a(0)=a(1)=1, a(2)=3.
 * @author Sean A. Irvine
 */
public class A003229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003229() {
    super(new long[] {2, 0, 1}, new long[] {1, 1, 3});
  }
}
