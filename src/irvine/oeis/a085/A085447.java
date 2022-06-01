package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085447 a(n) = 6*a(n-1) + a(n-2), starting with a(0)=2 and a(1)=6.
 * @author Sean A. Irvine
 */
public class A085447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085447() {
    super(new long[] {1, 6}, new long[] {2, 6});
  }
}
