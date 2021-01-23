package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016825 Positive integers congruent to 2 mod 4: a(n) = 4*n+2, for n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A016825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016825() {
    super(new long[] {-1, 2}, new long[] {2, 6});
  }
}
