package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017357 a(n) = (10*n + 7)^5.
 * @author Sean A. Irvine
 */
public class A017357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017357() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {16807, 1419857, 14348907, 69343957, 229345007, 601692057});
  }
}
