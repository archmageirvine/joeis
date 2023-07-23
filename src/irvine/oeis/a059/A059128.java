package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059128 A hierarchical sequence (W3{2,2} - see A059126).
 * @author Sean A. Irvine
 */
public class A059128 extends AbstractSequence {

  private final A059126 mSeq1 = new A059126();

  /** Construct the sequence. */
  public A059128() {
    super(0);
  }

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 3)) {
      case 0:
        mA = mSeq1.next().multiply2();
        return mA.subtract(1);
      case 1:
        return mA;
      case 2:
      default:
        return mA.subtract(1);
    }
  }
}

