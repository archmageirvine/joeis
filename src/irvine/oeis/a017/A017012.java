package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017012 a(n) = (7*n + 2)^8.
 * @author Sean A. Irvine
 */
public class A017012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017012() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 43046721, 4294967296L, 78310985281L, 656100000000L, 3512479453921L, 14048223625216L, 45767944570401L, 128063081718016L});
  }
}
