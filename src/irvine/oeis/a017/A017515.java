package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017515 <code>(11n+10)^7</code>.
 * @author Sean A. Irvine
 */
public class A017515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017515() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {10000000, 1801088541, 34359738368L, 271818611107L, 1338925209984L, 4902227890625L, 14645194571776L, 37725479487783L});
  }
}
