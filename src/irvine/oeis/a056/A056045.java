package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056045 a(n) = Sum_{d|n} binomial(n,d).
 * @author Georg Fischer
 */
public class A056045 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Binomial.binomial(mN, d));
  }
}
