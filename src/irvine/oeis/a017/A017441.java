package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017441 <code>a(n) = (11*n + 4)^5</code>.
 * @author Sean A. Irvine
 */
public class A017441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017441() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 759375, 11881376, 69343957, 254803968, 714924299});
  }
}
