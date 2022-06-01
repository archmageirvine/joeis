package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132773 a(n) = n*(n + 31).
 * @author Sean A. Irvine
 */
public class A132773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132773() {
    super(new long[] {1, -3, 3}, new long[] {0, 32, 66});
  }
}
