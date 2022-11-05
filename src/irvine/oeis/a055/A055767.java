package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;

/**
 * A055767 Index (or subscript) of the largest primorial (A002110(k)) which divides EulerPhi of the n-th primorial ((A005867(n)).
 * @author Sean A. Irvine
 */
public class A055767 extends A002110 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Sequence mASeq = new A002110();
  private Z mA = mASeq.next();
  private int mK = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z phi = mFactor.factorize(super.next()).phi();
    while (phi.mod(mA).isZero()) {
      ++mK;
      mA = mASeq.next();
    }
    return Z.valueOf(mK - 1);
  }
}
