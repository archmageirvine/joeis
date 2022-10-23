package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A058906 Inconsummate numbers in base 11: no number is this multiple of the sum of its digits (in base 11).
 * @author Sean A. Irvine
 */
public class A058906 extends Sequence1 {

  private static final long HEURISTIC = 250;
  private final int mBase;
  private long mN = 0;

  protected A058906(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A058906() {
    this(11);
  }

  @Override
  public Z next() {
    while (true) {
      long k = ++mN;
      while (ZUtils.digitSum(k, mBase) * mN != k && k < HEURISTIC * mN) {
        k += mN;
      }
      if (k == HEURISTIC * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
