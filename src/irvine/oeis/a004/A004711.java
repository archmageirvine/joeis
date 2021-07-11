package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004711 Positions of 1's in binary expansion of Pi/4.
 * @author Sean A. Irvine
 */
public class A004711 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004711() {
    super(0, CR.PI.divide(CR.FOUR), 2);
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
