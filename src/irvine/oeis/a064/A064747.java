package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064747 <code>a(n) = n*9^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A064747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064747() {
    super(new long[] {81, -99, 19}, new long[] {1, 10, 163});
  }
}
