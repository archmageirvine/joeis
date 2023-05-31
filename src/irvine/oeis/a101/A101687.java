package irvine.oeis.a101;
// manually rowsums at 2023-05-31 12:02

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A101687 a(n) = Sum_{k=1..n} floor(binomial(n,k)/k).
 * @author Georg Fischer
 */
public class A101687 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.valueOf(mN);
    }
    return Integers.SINGLETON.sum(1, mN, k -> Binomial.binomial(mN, k).divide(k));
  }
}
