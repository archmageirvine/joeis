package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189749 <code>a(1)=5, a(2)=5, a(n)=5*a(n-1) + 5*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A189749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189749() {
    super(new long[] {5, 5}, new long[] {5, 5});
  }
}
