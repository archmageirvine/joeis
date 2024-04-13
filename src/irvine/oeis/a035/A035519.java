package irvine.oeis.a035;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035519 Rare numbers: k-r and k+r are both perfect squares, where r is reverse of k and k is non-palindromic.
 * @author Sean A. Irvine
 */
public class A035519 extends Sequence1 {

  private Z mN = Z.valueOf(64);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z r = Functions.REVERSE.z(mN);
      if (r.compareTo(mN) < 0 && mN.subtract(r).isSquare() && mN.add(r).isSquare()) {
        return mN;
      }
    }
  }
}

