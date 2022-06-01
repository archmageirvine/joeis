package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017503 a(n) = (11*n + 9)^7.
 * @author Sean A. Irvine
 */
public class A017503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017503() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {4782969, 1280000000, 27512614111L, 230539333248L, 1174711139837L, 4398046511104L, 13348388671875L, 34792782221696L});
  }
}
