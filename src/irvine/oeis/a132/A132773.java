package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132773 <code>a(n) = n*(n + 31)</code>.
 * @author Sean A. Irvine
 */
public class A132773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132773() {
    super(new long[] {1, -3, 3}, new long[] {0, 32, 66});
  }
}
