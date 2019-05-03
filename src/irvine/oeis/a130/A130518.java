package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130518 <code>a(n) = Sum_{k=0..n} floor(k/3)</code>. (Partial sums of <code>A002264.)</code>.
 * @author Sean A. Irvine
 */
public class A130518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130518() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 0, 0, 1, 2});
  }
}
