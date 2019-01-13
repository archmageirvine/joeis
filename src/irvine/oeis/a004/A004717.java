package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004717.
 * @author Sean A. Irvine
 */
public class A004717 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.log().divide(CR.THREE.log());

  /** Construct the sequence */
  public A004717() {
    super(false, 2);
    super.next();
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
