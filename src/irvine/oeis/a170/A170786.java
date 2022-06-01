package irvine.oeis.a170;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A170786 a(n) = n^9*(n^4 + 1)/2.
 * @author Sean A. Irvine
 */
public class A170786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170786() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {0, 1, 4352, 807003, 33685504, 611328125, 6535385856L, 48464682007L, 274945015808L, 1271126624409L, 5000500000000L, 17262535045811L, 53499182579712L, 151442855545813L});
  }
}
