package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027602 <code>a(n) = n^3 + (n+1)^3 + (n+2)^3</code>.
 * @author Sean A. Irvine
 */
public class A027602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027602() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 36, 99, 216});
  }
}
