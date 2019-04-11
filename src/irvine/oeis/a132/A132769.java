package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132769 <code>a(n) = n*(n + 27)</code>.
 * @author Sean A. Irvine
 */
public class A132769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132769() {
    super(new long[] {1, -3, 3}, new long[] {0, 28, 58});
  }
}
