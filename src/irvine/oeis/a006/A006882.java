package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006882 Double factorials n!!: a(n) = n*a(n-2) for n &gt; 1, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A006882 extends AbstractSequence {

  /* Construct the sequence. */
  public A006882() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
