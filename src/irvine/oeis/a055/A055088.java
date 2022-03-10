package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055088 Triangle of generalized Legendre symbols L(a/b), with 1's for quadratic residues and 0's for quadratic non-residues.
 * @author Sean A. Irvine
 */
public class A055088 implements Sequence {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return ZUtils.isQuadraticResidue(Z.valueOf(mM), Z.valueOf(mN)) ? Z.ONE : Z.ZERO;
  }
}
