package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189746 a(1)=5,  a(2)=2, a(n)=5*a(n-1) + 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A189746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189746() {
    super(1, new long[] {2, 5}, new long[] {5, 2});
  }
}
