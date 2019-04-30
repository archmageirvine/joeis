package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130205 <code>a(n) = n^2 - a(n-1) - a(n-2)</code>, with <code>a(1) = 1</code> and <code>a(2) = 2</code>.
 * @author Sean A. Irvine
 */
public class A130205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130205() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 6, 8, 11});
  }
}
