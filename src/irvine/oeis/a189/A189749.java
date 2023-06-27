package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189749 a(1)=5,  a(2)=5, a(n)=5*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A189749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189749() {
    super(1, new long[] {5, 5}, new long[] {5, 5});
  }
}
