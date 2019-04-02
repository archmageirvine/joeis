package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132759 a(n) = n(n+13).
 * @author Sean A. Irvine
 */
public class A132759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132759() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 30});
  }
}
