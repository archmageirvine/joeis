package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074507 <code>a(n) = 1^n + 3^n + 5^n</code>.
 * @author Sean A. Irvine
 */
public class A074507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074507() {
    super(new long[] {15, -23, 9}, new long[] {3, 9, 35});
  }
}
