package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087288 a(n)=2a(n-1)+a(n-2)-2a(n-3).
 * @author Sean A. Irvine
 */
public class A087288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087288() {
    super(new long[] {-2, 1, 2}, new long[] {4, 4, 10});
  }
}
