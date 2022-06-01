package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060189 A column and diagonal of A060187 (k=3).
 * @author Sean A. Irvine
 */
public class A060189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060189() {
    super(new long[] {-45, 174, -263, 196, -75, 14}, new long[] {1, 23, 230, 1682, 10543, 60657});
  }
}
