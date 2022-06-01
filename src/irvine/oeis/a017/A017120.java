package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017120 a(n) = (8*n + 4)^8.
 * @author Sean A. Irvine
 */
public class A017120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017120() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 429981696, 25600000000L, 377801998336L, 2821109907456L, 14048223625216L, 53459728531456L, 167961600000000L, 457163239653376L});
  }
}
