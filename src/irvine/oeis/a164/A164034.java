package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164034 a(n) = ((4+3*sqrt(2))*(4+sqrt(2))^n + (4-3*sqrt(2))*(4-sqrt(2))^n)/4.
 * @author Sean A. Irvine
 */
public class A164034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164034() {
    super(new long[] {-14, 8}, new long[] {2, 11});
  }
}
