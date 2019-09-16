package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026105 Triangle T read by rows: differences of Motzkin triangle <code>(A026300)</code>.
 * @author Sean A. Irvine
 */
public class A026105 extends A026300 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM).subtract(t(mN - 1, mM - 1)).max(Z.ONE);
  }
}
