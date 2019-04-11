package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083098 <code>a(n) = 2*a(n-1) + 6*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A083098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083098() {
    super(new long[] {6, 2}, new long[] {1, 1});
  }
}
