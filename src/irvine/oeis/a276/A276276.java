package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276276 a(n) = a(n-2)+a(n-3) with a(1)=2 a(2)=1 a(3)=0.
 * @author Sean A. Irvine
 */
public class A276276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276276() {
    super(new long[] {1, 1, 0}, new long[] {2, 1, 0});
  }
}
