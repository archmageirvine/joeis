package irvine.oeis.a000;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000600 Number of tertiary alcohols (alkanols or alkyl alcohols C_n H_{2n+1} OH) with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000600 extends A000598 {

  private boolean mFirst = true;
  private final CycleIndex mZS3 = SymmetricGroup.create(3).cycleIndex();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    super.next();
    return mZS3.apply(RING.subtract(mG, RING.one()), mN).coeff(mN).toZ();
  }
}

