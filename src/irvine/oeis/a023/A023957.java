package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;

/**
 * A023957 n-th digit after the decimal point of the n-th root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A023957 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence s = new DecimalExpansionSequence() {
      private final CR mA = CR.valueOf(++A023957.this.mN);
      private final CR mB = ComputableReals.SINGLETON.pow(mA, mA.inverse());
      @Override
      protected CR getCR() {
        return mB;
      }
    };
    for (int k = 0; k < mN; ++k) {
      s.next();
    }
    return s.next();
  }
}
