package irvine.oeis.a069;
// manually hygeom/hygeo at 2022-08-04 18:08

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069865 a(n) = Sum_{k = 0..n} C(n,k)^6.
 * @author Georg Fischer
 */
public class A069865 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(mN, k).pow(6));
  }
}
