package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258073 a(n) = 1 + 78557*2^n.
 * @author Sean A. Irvine
 */
public class A258073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258073() {
    super(new long[] {-2, 3}, new long[] {157115, 314229});
  }
}
