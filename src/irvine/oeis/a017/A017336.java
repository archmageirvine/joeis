package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017336 a(n) = (10*n + 5)^8.
 * @author Sean A. Irvine
 */
public class A017336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017336() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {390625, 2562890625L, 152587890625L, 2251875390625L, 16815125390625L, 83733937890625L, 318644812890625L, 1001129150390625L, 2724905250390625L});
  }
}
