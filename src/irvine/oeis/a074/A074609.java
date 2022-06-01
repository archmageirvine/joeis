package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074609 a(n) = 3^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074609() {
    super(new long[] {-24, 11}, new long[] {2, 11});
  }
}
