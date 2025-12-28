package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082842 Numbers k such that k = x^2 + y^2 where x is the least primitive root of k. k is the first such number with x increasing in the sequence, x can be found in A082843.
 * @author Sean A. Irvine
 */
public class A082842 extends Sequence1 {

  private long mN = 0;
  private Z mX = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z x = Functions.LEAST_PRIMITIVE_ROOT.z(n);
      final Z s = n.subtract(x.square());
      if (x.compareTo(mX) > 0 && !s.isZero() && s.isSquare()) {
        mX = x;
        return n;
      }
    }
  }
}
