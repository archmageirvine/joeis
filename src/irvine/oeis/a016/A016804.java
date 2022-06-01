package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016804 a(n) = (4*n)^4.
 * @author Sean A. Irvine
 */
public class A016804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016804() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 256, 4096, 20736, 65536});
  }
}
