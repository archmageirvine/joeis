package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001511;

/**
 * A059130 A hierarchical sequence (W2{3}* - see A059126).
 * @author Sean A. Irvine
 */
public class A059130 extends AbstractSequence {

  private final A001511 mSeq1 = new A001511();

  /** Construct the sequence. */
  public A059130() {
    super(0);
  }

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 7)) {
      case 0:
        do {
          mA = mSeq1.next();
        } while (mA.compareTo(Z.TWO) <= 0);
        return mA.subtract(2);
      case 3:
        return mA;
      case 2:
      case 4:
      case 6:
        return mA.subtract(2);
      case 1:
      case 5:
      default:
        return mA.subtract(1);
    }
  }
}

