package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168223 A006369(n) - A006368(n).
 * @author Sean A. Irvine
 */
public class A168223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168223() {
    super(new long[] {-1, -2, -2, 0, 3, 4, 3, 0, -2, -2}, new long[] {0, 0, 0, 0, -1, 3, -5, 4, -1, -1});
  }
}
