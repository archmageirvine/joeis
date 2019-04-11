package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002203 Companion Pell numbers: <code>a(n) = 2a(n-1) + a(n-2), a(0) = a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A002203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002203() {
    super(new long[] {1, 2}, new long[] {2, 2});
  }
}
