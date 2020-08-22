package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034095 Indices of (-1)sigma perfect numbers.
 * @author Sean A. Irvine
 */
public class A034095 implements Sequence {

  // Only good for a few terms ...

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Cheetah.factor(mN).sigma(-1);
      if (s.mod(mN).equals(Z.ZERO)) {
        return s.divide(mN);
      }
    }
  }
}

