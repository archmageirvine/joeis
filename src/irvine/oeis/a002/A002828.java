package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a000.A000415;
import irvine.oeis.a000.A000419;

/**
 * A002828 Least number of squares that add up to <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002828 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private final Sequence mSquares1 = new A000290();
  private final Sequence mSquares2 = new A000415();
  private final Sequence mSquares3 = new A000419();
  private Z mA1 = mSquares1.next();
  private Z mA2 = mSquares2.next();
  private Z mA3 = mSquares3.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mA1.equals(mN)) {
      mA1 = mSquares1.next();
      if (Z.ZERO.equals(mN)) {
        return Z.ZERO;
      }
      return Z.ONE;
    }
    if (mA2.equals(mN)) {
      mA2 = mSquares2.next();
      return Z.TWO;
    }
    if (mA3.equals(mN)) {
      mA3 = mSquares3.next();
      return Z.THREE;
    }
    return Z.FOUR;
  }
}
