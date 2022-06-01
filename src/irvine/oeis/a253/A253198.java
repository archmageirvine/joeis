package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253198 a(n) = a(n-1) + a(n-2) - (-1)^(a(n-1) + a(n-2))) with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A253198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253198() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 2, 4, 5});
  }
}
