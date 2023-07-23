package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001511;

/**
 * A059131 A hierarchical sequence (W3{2,2}* - see A059126).
 * @author Sean A. Irvine
 */
public class A059131 extends AbstractSequence {

  private final A001511 mSeq1 = new A001511();

  /** Construct the sequence. */
  public A059131() {
    super(0);
  }

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 9)) {
      case 0:
        mA = mSeq1.next().add(2);
        return mA.subtract(2);
      case 4:
        return mA;
      case 2:
      case 6:
      case 8:
        return mA.subtract(2);
      case 1:
      case 3:
      case 5:
      case 7:
      default:
        return mA.subtract(1);
    }
  }
}

