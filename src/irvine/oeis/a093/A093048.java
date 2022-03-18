package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A093048 a(n) = n minus exponent of 2 in n, with a(0) = 0.
 * a(n) = n - valuation(n, 2)
 * @author Georg Fischer
 */
public class A093048 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A093048() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - ZUtils.valuation(Z.TWO, Z.valueOf(mN)));
  }
}
