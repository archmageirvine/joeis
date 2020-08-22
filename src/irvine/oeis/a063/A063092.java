package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063092 a(0)=1, a(1)=2 and, for n&gt;1, a(n) = a(n-1) + 11*a(n-2).
 * @author Sean A. Irvine
 */
public class A063092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063092() {
    super(new long[] {11, 1}, new long[] {1, 2});
  }
}
