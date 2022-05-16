package irvine.oeis.a340;
// manually build/trionk

import irvine.math.z.Z;
import irvine.oeis.a060.A060642;

/**
 * A340987 Number of colored integer partitions of 2n such that all colors from an n-set are used.
 * @author Georg Fischer
 */
public class A340987 extends A060642 {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    return super.compute(2 * mN + 1, mN);
  }
}

