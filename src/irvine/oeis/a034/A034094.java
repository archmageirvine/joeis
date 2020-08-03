package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034094 <code>(-1)sigma</code> perfect numbers: <code>(-1)sigma(a) = m*a</code> for some integer m, where if a = Product <code>p(i)^r(i)</code> then <code>(-1)sigma(a) =</code> Product <code>(-1+Sum p(i)^s(i), s(i)=1</code> to <code>r(i))</code>.
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

