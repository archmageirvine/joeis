package irvine.oeis.a215;
// Generated by gen_seq4.pl arsimple/simple0 at 2021-11-18 23:20

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A215265 a(n) = (n-1)^(n+1) - n^n.
 * @author Georg Fischer
 */
public class A215265 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return Z.valueOf(mN - 1).pow(mN + 1).subtract(n.pow(mN));
  }
}
