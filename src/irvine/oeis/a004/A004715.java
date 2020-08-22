package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004715 Positions of ones in binary expansion of arctan(1/2)/Pi.
 * @author Sean A. Irvine
 */
public class A004715 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.atan(CR.HALF).divide(CR.PI);

  /** Construct the sequence */
  public A004715() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }

  private long mPos = 2;

  @Override
  public Z next() {
    while (true) {
      ++mPos;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mPos);
      }
    }
  }
}
