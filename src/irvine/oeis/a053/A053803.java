package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053803 Numbers where the difference of consecutive cubes is "close" to another cube: let A = x^3 - (x-1)^3, sequence is the x's where A - int(A^(1/3))^3 &lt; int(x^(1/2))^3.
 * @author Sean A. Irvine
 */
public class A053803 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z a = mN.pow(3).subtract(mN.subtract(1).pow(3));
      if (a.subtract(a.root(3).pow(3)).compareTo(mN.sqrt().pow(3)) < 0) {
        return mN;
      }
    }
  }
}

