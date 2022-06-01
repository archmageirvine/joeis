package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189747 a(1)=5,  a(2)=3, a(n)=5*a(n-1) + 3*a(n-2).
 * @author Sean A. Irvine
 */
public class A189747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189747() {
    super(new long[] {3, 5}, new long[] {5, 3});
  }
}
