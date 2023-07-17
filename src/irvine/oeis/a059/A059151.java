package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a006.A006519;

/**
 * A059151 A hierarchical sequence (W'3{2,2}* - see A059126).
 * @author Sean A. Irvine
 */
public class A059151 extends A006519 {

  /** Construct the sequence. */
  public A059151() {
    super(0);
  }

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 9)) {
      case 0:
        mA = super.next();
        return mA;
      case 4:
        return mA.multiply(4);
      case 2:
      case 6:
      case 8:
        return mA;
      case 1:
      case 3:
      case 5:
      case 7:
      default:
        return mA.multiply2();
    }
  }
}

