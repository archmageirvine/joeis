package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253198 <code>a(n) = a(n-1) + a(n-2) - (-1)^(a(n-1) + a(n-2)))</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A253198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253198() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 2, 4, 5});
  }
}
