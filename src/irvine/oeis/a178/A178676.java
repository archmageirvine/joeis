package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178676 <code>a(n) = 5^n + 5</code>.
 * @author Sean A. Irvine
 */
public class A178676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178676() {
    super(new long[] {-5, 6}, new long[] {6, 10});
  }
}
