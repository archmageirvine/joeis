package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074604 <code>a(n) = 2^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074604() {
    super(new long[] {-18, 11}, new long[] {2, 11});
  }
}
