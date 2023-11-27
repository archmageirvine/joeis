package irvine.oeis.a066;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007870;

/**
 * A066948 Triangle of prime signature of A007870(n), read by rows.
 * @author Sean A. Irvine
 */
public class A066948 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Sequence mSeq = new A007870().skip();
  private int[] mA = new int[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      final FactorSequence fs = mFactor.factorize(mSeq.next());
      mA = new int[fs.omega()];
      if (mA.length == 0) {
        return Z.ZERO;
      }
      int k = 0;
      for (final Z p : fs.toZArray()) {
        mA[k++] = fs.getExponent(p);
      }
      mM = 0;
    }
    return Z.valueOf(mA[mM]);
  }
}
