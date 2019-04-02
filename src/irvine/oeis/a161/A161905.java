package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161905 a(n) = 13*a(n-1) - 65*a(n-2) + 156*a(n-3) - 182*a(n-4) + 91*a(n-5) - 13*a(n-6), with a(1)..a(6) as shown.
 * @author Sean A. Irvine
 */
public class A161905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161905() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {2, 4, 13, 52, 221, 949});
  }
}
