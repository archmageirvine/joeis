package irvine.oeis.a066;
// manually hygeom at 2022-08-04 18:08

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066382 a(n) = Sum_{k=0..n} binomial(n^2,k).
 * @author Georg Fischer
 */
public class A066382 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(mN * mN, k));
  }
}
