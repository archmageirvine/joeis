package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a006.A006519;

/**
 * A059150 A hierarchical sequence (W'2{3}* - see A059126).
 * @author Sean A. Irvine
 */
public class A059150 extends A006519 {

  /** Construct the sequence. */
  public A059150() {
    super(0);
  }

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 7)) {
      case 0:
        do {
          mA = super.next();
        } while (mA.compareTo(Z.TWO) <= 0);
        return mA.shiftRight(2);
      case 3:
        return mA;
      case 2:
      case 4:
      case 6:
        return mA.shiftRight(2);
      case 1:
      case 5:
      default:
        return mA.divide2();
    }
  }
}

