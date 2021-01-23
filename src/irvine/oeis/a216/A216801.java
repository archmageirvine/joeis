package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216801 a(n)  = 13*a(n-1) - 65*a(n-2) + 156*a(n-3) - 182*a(n-4) + 91*a(n-5) - 13*a(n-6).
 * @author Sean A. Irvine
 */
public class A216801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216801() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {2, -22, -117, -468, -1755, -6513});
  }
}
