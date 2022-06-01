package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185127 a(n) = n 3's sandwiched between two 1's.
 * @author Sean A. Irvine
 */
public class A185127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185127() {
    super(new long[] {-10, 11}, new long[] {11, 131});
  }
}
