package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002884 Number of nonsingular <code>n X n</code> matrices over <code>GF(2)</code>; order of Chevalley group <code>A_n (2)</code>; order of projective special linear group <code>PSL_n(2)</code>.
 * @author Sean A. Irvine
 */
public class A002884 implements Sequence {

  protected int mN = -1;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mP = mP.multiply(Z.ONE.shiftLeft(mN).subtract(1));
    }
    return mP.shiftLeft((mN * mN - mN) / 2);
  }
}
