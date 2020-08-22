package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052466 a(n) is the smallest positive solution k to 24*k == 1 (mod 13^n).
 * @author Sean A. Irvine
 */
public class A052466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052466() {
    super(new long[] {-169, 169, 1}, new long[] {6, 162, 1007});
  }
}
