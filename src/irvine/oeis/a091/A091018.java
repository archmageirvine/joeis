package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A091018 Numbers in n-th upward diagonal of triangle T : 0; 1, 2; 3, 4, 5; 6, 7, 8, 9; ...
 * @author Sean A. Irvine
 */
public class A091018 extends AbstractSequence {

  /** Construct the sequence. */
  public A091018() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n - m).square().add(n + m).divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
