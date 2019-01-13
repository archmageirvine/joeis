package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004711.
 * @author Sean A. Irvine
 */
public class A004711 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.FOUR);

  /** Construct the sequence */
  public A004711() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }

  private long mPos = 0;

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
