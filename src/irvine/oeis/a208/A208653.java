package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A208653 a(n) = Product_{i=floor((n + 1)/2)..n-1} binomial(n-1, i).
 * @author Georg Fischer
 */
public class A208653 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product((mN + 1) / 2, mN - 1, i -> Binomial.binomial(mN - 1, i));
  }
}
