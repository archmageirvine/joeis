package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A016859.
 * @author Sean A. Irvine
 */
public class A016859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016859() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12},
      new Z[] {Z.ZERO, Z.valueOf(48828125), Z.valueOf(100000000000L), Z.valueOf(8649755859375L), Z.valueOf(204800000000000L), Z.valueOf(2384185791015625L), Z.valueOf(17714700000000000L), Z.valueOf(96549157373046875L), Z.valueOf(419430400000000000L), Z.valueOf(1532278301220703125L), Z.valueOf(4882812500000000000L), new Z("13931233916552734375")});
  }
}
