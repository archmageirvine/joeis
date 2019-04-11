package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017324 <code>a(n) = (10*n + 4)^8</code>.
 * @author Sean A. Irvine
 */
public class A017324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017324() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 1475789056, 110075314176L, 1785793904896L, 14048223625216L, 72301961339136L, 281474976710656L, 899194740203776L, 2478758911082496L});
  }
}
