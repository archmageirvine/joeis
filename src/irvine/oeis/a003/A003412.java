package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003412.
 * @author Sean A. Irvine
 */
public class A003412 extends LinearRecurrence {

  private static final int[] INITIAL = {1, 2, 3, 4, 6, 8};
  private int mN = 0;

  /** Construct the sequence. */
  public A003412() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {11, 14, 18, 24, 32, 43});
  }

  @Override
  public Z next() {
    return mN < INITIAL.length ? Z.valueOf(INITIAL[mN++]) : super.next();
  }
}
