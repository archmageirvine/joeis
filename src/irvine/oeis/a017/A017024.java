package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017024 a(n) = (7*n + 3)^8.
 * @author Sean A. Irvine
 */
public class A017024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017024() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 100000000, 6975757441L, 110075314176L, 852891037441L, 4347792138496L, 16815125390625L, 53459728531456L, 146830437604321L});
  }
}
