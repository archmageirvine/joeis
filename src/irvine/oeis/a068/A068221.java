package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A068221 An auxiliary bit-mask sequence for computing A066425. (The "clean", symmetric one).
 * @author Sean A. Irvine
 */
public class A068221 extends Sequence1 {

  private final Sequence mSeq1 = new A068059();
  private final Sequence mSeq2 = new A068739();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(Z.ONE.shiftLeft(mSeq2.next().add(mSeq1.next()).subtract(1).longValueExact()).add(1));
    return mA;
  }
}
