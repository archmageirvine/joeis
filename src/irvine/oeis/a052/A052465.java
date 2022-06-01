package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052465 a(n) is the smallest positive integral solution k to 24*k == 1 (mod 11^n).
 * @author Sean A. Irvine
 */
public class A052465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052465() {
    super(new long[] {-121, 121, 1}, new long[] {6, 116, 721});
  }
}
