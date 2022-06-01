package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052462 a(n) is the minimal positive integral solution k to 24*k == 1 (mod 5^n).
 * @author Sean A. Irvine
 */
public class A052462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052462() {
    super(new long[] {-25, 25, 1}, new long[] {4, 24, 99});
  }
}
