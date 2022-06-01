package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132771 a(n) = n*(n + 29).
 * @author Sean A. Irvine
 */
public class A132771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132771() {
    super(new long[] {1, -3, 3}, new long[] {0, 30, 62});
  }
}
