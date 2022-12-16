package irvine.oeis.a007;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007370 Numbers k such that sigma(x) = k has a unique solution.
 * @author Sean A. Irvine
 */
public class A007370 extends Sequence1 {

  private long mN = 0;
  private final Z mTarget;

  protected A007370(final long target) {
    mTarget = Z.valueOf(target);
  }

  /** Construct the sequence. */
  public A007370() {
    this(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (InverseSigma.countInverseSigma(Z.valueOf(mN), 1).equals(mTarget)) {
        return Z.valueOf(mN);
      }
    }
  }
}
