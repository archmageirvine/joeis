package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A046071 Triangle of nonzero quadratic residues mod n.
 * @author Sean A. Irvine
 */
public class A046071 extends Sequence2 {

  private Z mN = Z.TWO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mM = mM.add(1);
      if (mN.equals(mM)) {
        mN = mN.add(1);
        mM = Z.ONE;
      }
      if (ZUtils.isQuadraticResidue(mM, mN)) {
        return mM;
      }
    }
  }
}
