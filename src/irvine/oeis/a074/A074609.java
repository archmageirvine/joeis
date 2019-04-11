package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074609 <code>a(n) = 3^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074609() {
    super(new long[] {-24, 11}, new long[] {2, 11});
  }
}
