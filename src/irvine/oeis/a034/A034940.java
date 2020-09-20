package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034940 Number of rooted labeled triangular cacti with 2n+1 nodes (n triangles).
 * @author Sean A. Irvine
 */
public class A034940 implements Sequence {

  protected int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(2 * mN - 1);
    }
    return mF.multiply(Z.valueOf(2 * mN + 1).pow(mN));
  }
}
