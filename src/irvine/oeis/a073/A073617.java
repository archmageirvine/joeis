package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073617 Consider Pascal's triangle A007318; a(n) = product of terms at +45 degrees slope with the horizontal.
 * @author Georg Fischer
 */
public class A073617 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ONE : Integers.SINGLETON.product(1, (mN + 1) / 2, k -> Binomial.binomial(mN + 1 - k, k));
  }
}
