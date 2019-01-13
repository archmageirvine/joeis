package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059979.
 * @author Sean A. Irvine
 */
public class A059979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059979() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {1, 2187, 279936, 10000000, 170859375, 1801088541, 13492928512L, 78364164096L, 373669453125L, 1522435234375L, 5455160701056L, 17565568854912L, 51676101935731L, 140710042265625L, 358318080000000L});
  }
}
