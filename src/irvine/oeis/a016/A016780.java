package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016780 a(n) = (3*n+1)^4.
 * @author Sean A. Irvine
 */
public class A016780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016780() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 256, 2401, 10000, 28561});
  }
}
