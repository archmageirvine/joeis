package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A089265 a(1) = 0; thereafter a(2*n) = a(n) + 1, a(2*n+1) = 2*n.
 * a(n) = valuation(n, 2) + n/2^valuation(n, 2) - 1.
 * @author Georg Fischer
 */
public class A089265 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A089265() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final long v2 = ZUtils.valuation(Z.valueOf(mN), Z.TWO);
    return Z.valueOf(v2 + mN / (1L << v2) - 1);
  }
}
