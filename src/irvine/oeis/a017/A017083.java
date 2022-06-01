package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017083 a(n) = (8*n + 1)^7.
 * @author Sean A. Irvine
 */
public class A017083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017083() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 4782969, 410338673, 6103515625L, 42618442977L, 194754273881L, 678223072849L, 1954897493193L});
  }
}
