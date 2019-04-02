package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A005348 Number of ways to add n ordinals.
 * @author Sean A. Irvine
 */
public class A005348 extends LinearRecurrence {

  private static final long[] LEADER = {1, 2, 5, 13, 33, 81, 193, 449, 1089, 2673, 6561, 15633, 37249, 88209};
  private int mN = 0;

  /** Construct the sequence */
  public A005348() {
    super(new long[] {81, 0, 0, 0, 0}, new long[] {216513, 531441, 1266273, 3017169, 7189057});
  }

  @Override
  public Z next() {
    if (mN < LEADER.length) {
      return Z.valueOf(LEADER[mN++]);
    } else {
      return super.next();
    }
  }
}
