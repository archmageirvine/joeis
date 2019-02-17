package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018839.
 * @author Sean A. Irvine
 */
public class A018839 implements Sequence {

  private static final int[] SMALL_CASES = {1, 8, 32, 88, 192, 304, 372, 416};
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < SMALL_CASES.length ? Z.valueOf(SMALL_CASES[(int) mN]) : Z.valueOf(68 * mN - 72);
  }
}
