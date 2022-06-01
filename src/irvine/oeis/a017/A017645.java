package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017645 (12n+10)^5.
 * @author Sean A. Irvine
 */
public class A017645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017645() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {100000, 5153632, 45435424, 205962976, 656356768, 1680700000});
  }
}
