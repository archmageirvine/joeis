package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081708 <code>a(n) = a(n-1) + 64*a(n-2)</code> starting with <code>a(0) = 2</code> and <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A081708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081708() {
    super(new long[] {64, 1}, new long[] {2, 1});
  }
}
