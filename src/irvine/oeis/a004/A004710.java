package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004710 Positions of ones in binary expansion of Euler's constant gamma.
 * @author Sean A. Irvine
 */
public class A004710 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004710() {
    super(1, CR.GAMMA, 2);
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
