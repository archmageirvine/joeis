package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A392325 Vampire numbers in base 12 (definition 2): decimal values of base-12 integers n for which there exist fangs x and y, where x and y have the same number of base-12 digits, x * y = n, the concatenation of the base-12 digits of x and y is a permutation of the base-12 digits of n, and not both x and y end in 0 (base 12).
 * @author Sean A. Irvine
 */
public class A392325 extends Sequence1 {

  private final int mBase;
  private Z mN;
  private Z mJump;
  private int mHalfLength;

  protected A392325(final int base, final long start) {
    mBase = base;
    mJump = Z.valueOf(base).pow(4);
    mN = Z.valueOf(start - 1);
    mHalfLength = mN.toString(mBase).length() / 2;
  }

  /** Construct the sequence. */
  public A392325() {
    this(12, 2100);
  }

  protected Z select(final Z n, final Z d) {
    return n;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mJump.equals(mN)) {
        mN = mN.multiply(mBase);
        mJump = mJump.multiply((long) mBase * mBase);
        ++mHalfLength;
      }
      final int[] counts = ZUtils.digitCounts(mN, mBase);
      final Z s = mN.sqrt();
      for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
        if (d.compareTo(s) <= 0 && d.toString(mBase).length() == mHalfLength) {
          final Z e = mN.divide(d);
          if (d.mod(mBase) != 0 || e.mod(mBase) != 0) {
            final int[] cd = ZUtils.digitCounts(d, mBase);
            final int[] ce = ZUtils.digitCounts(e, mBase);
            boolean ok = true;
            for (int k = 0; k < counts.length; ++k) {
              if (counts[k] != cd[k] + ce[k]) {
                ok = false;
                break;
              }
            }
            if (ok) {
              return select(mN, d);
            }
          }
        }
      }
    }
  }
}
