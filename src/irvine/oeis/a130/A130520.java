package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130520 <code>a(n) = Sum_{k=0..n} floor(k/5)</code>. (Partial sums of <code>A002266)</code>.
 * @author Sean A. Irvine
 */
public class A130520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130520() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 1, 2});
  }
}
