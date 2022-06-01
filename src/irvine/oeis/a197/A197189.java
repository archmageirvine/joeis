package irvine.oeis.a197;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A197189 a(n) = 3*a(n-1) + 5*a(n-2), with a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A197189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197189() {
    super(new long[] {5, 3}, new long[] {1, 2});
  }
}
