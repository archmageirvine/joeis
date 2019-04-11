package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155626 <code>5^n-4^n+1</code>.
 * @author Sean A. Irvine
 */
public class A155626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155626() {
    super(new long[] {20, -29, 10}, new long[] {1, 2, 10});
  }
}
