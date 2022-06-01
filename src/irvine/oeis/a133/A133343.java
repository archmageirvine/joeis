package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133343 a(n)=2a(n-1)+13a(n-2) for n&gt;1, a(0)=1, a(1)=1 .
 * @author Sean A. Irvine
 */
public class A133343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133343() {
    super(new long[] {13, 2}, new long[] {1, 1});
  }
}
