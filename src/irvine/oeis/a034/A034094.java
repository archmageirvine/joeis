package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034094 (-1)sigma perfect numbers: (-1)sigma(a) = m*a for some integer m, where if a = Product p(i)^r(i) then (-1)sigma(a) = Product_{i} (-1 + Sum_{s=1..r(i)} p(i)^s).
 * @author Sean A. Irvine
 */
public class A034094 implements Sequence {

  // Only good for a few terms ...

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).sigma(-1).mod(mN).equals(Z.ZERO)) {
        return mN;
      }
    }
  }
}

