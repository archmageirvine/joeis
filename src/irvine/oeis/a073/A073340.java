package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073340 Fibonacci prime pairs: the indices of each pair differ by two and the relevant Fibonacci numbers are both prime.
 * @author Sean A. Irvine
 */
public class A073340 extends Sequence1 {

  private Z mB = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mB != null) {
      final Z res = mB;
      mB = null;
      return res;
    }
    while (true) {
      ++mN;
      if (Functions.FIBONACCI.z(mN).isProbablePrime() && Functions.FIBONACCI.z(mN + 2).isProbablePrime()) {
        mB = Z.valueOf(mN + 2);
        return Z.valueOf(mN);
      }
    }
  }
}

