package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017023 a(n) = (7*n + 3)^7.
 * @author Sean A. Irvine
 */
public class A017023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017023() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2187, 10000000, 410338673, 4586471424L, 27512614111L, 114415582592L, 373669453125L, 1028071702528L});
  }
}
