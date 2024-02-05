package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068222 An auxiliary bit-mask sequence for computing A066425. (The "dirty", unsymmetric one).
 * @author Sean A. Irvine
 */
public class A068222 extends A068221 {

  private final Sequence mSeq = new A068058();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? super.next() : super.next().or(mA.shiftRight(mSeq.next().longValueExact()));
    return mA;
  }
}

