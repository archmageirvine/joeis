package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082816 Primitive roots x of sequence A082815.
 * @author Sean A. Irvine
 */
public class A082816 extends A000040 {

  private Z mX = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z x = Functions.LEAST_PRIMITIVE_ROOT.z(p);
      if (x.compareTo(mX) > 0 && p.subtract(x.square()).isSquare()) {
        mX = x;
        return mX;
      }
    }
  }
}
