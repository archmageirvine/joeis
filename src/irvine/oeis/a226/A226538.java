package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226538 a(2t) = a(2t-1) <code>+ 1,</code> a(2t+1) = a(2t) + a(2t-2) for t <code>&gt;= 1,</code> with <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A226538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226538() {
    super(new long[] {-1, 0, 0, 0, 2, 0}, new long[] {1, 1, 2, 3, 4, 6});
  }
}
