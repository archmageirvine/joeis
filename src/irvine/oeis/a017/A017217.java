package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017217 a(n) = (9*n + 4)^9.
 * @author Sean A. Irvine
 */
public class A017217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017217() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 10604499373L, 1207269217792L, 26439622160671L, 262144000000000L, 1628413597910449L, 7427658739644928L, 27206534396294947L, 84590643846578176L, 231616946283203125L});
  }
}
