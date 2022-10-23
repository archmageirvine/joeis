package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A208652 Product{i*C(n,i) : 1&lt;=i&lt;=floor[(n+1)/2]}.
 * @author Georg Fischer
 */
public class A208652 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, (mN + 1) / 2, i -> Binomial.binomial(mN, i).multiply(i));
  }
}
