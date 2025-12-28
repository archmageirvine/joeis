package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082843 Primitive roots x of sequence A082842.
 * @author Sean A. Irvine
 */
public class A082843 extends Sequence1 {

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
        return mX;
      }
    }
  }
}
