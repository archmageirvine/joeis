package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017085 a(n) = (8*n + 1)^9.
 * @author Sean A. Irvine
 */
public class A017085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017085() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 387420489, 118587876497L, 3814697265625L, 46411484401953L, 327381934393961L, 1628413597910449L, 6351461955384057L, 20711912837890625L, 58871586708267913L});
  }
}
