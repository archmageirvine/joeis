package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017432 (11n+3)^8.
 * @author Sean A. Irvine
 */
public class A017432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017432() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 1475789056, 152587890625L, 2821109907456L, 23811286661761L, 128063081718016L, 513798374428641L, 1677721600000000L, 4702525276151521L});
  }
}
