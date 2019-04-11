package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053428 <code>a(n) = a(n-1) + 20*a(n-2), n &gt;= 2</code>; <code>a(0)=1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A053428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053428() {
    super(new long[] {20, 1}, new long[] {1, 1});
  }
}
