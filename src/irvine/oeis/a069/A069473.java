package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069473 First differences of (n+1)^6-n^6 (A022522).
 * @author Sean A. Irvine
 */
public class A069473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069473() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {62, 602, 2702, 8162, 19502});
  }
}
