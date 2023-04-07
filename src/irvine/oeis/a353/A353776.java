package irvine.oeis.a353;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A353776 a(n) = Sum_{d|n} (n/d mod d).
 * @author Georg Fischer
 */
public class A353776 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(mN / d).mod(Z.valueOf(d)));
  }
}
