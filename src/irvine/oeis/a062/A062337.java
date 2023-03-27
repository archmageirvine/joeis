package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062337 Primes whose sum of digits is 7.
 * @author Sean A. Irvine
 */
public class A062337 extends Sequence1 {

  private final long mTarget;
  private final TreeSet<Z> mA = new TreeSet<>();

  protected A062337(final long target) {
    mTarget = target;
    for (long k = 1; k <= Math.min(9, mTarget); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  /** Construct the sequence. */
  public A062337() {
    this(7);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final long digitSum = ZUtils.digitSum(t);
      final Z t10 = t.multiply(10);
      for (long k = 0; k <= Math.min(9, mTarget - digitSum); ++k) {
        mA.add(t10.add(k));
      }
      if (digitSum == mTarget && t.isProbablePrime()) {
        return t;
      }
    }
  }
}

