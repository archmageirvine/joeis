package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A208653 Product{C(n-1,i) : 1&lt;=i&lt;=floor[(n+1)/2]}.
 * @author Georg Fischer
 */
public class A208653 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product((mN + 1) / 2, mN - 1, i -> Binomial.binomial(mN - 1, i));
  }
}
