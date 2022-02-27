package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054876 Number of pairwise incongruent triangles with integer sides and positive integer area and second longest side of length n.
 * @author Sean A. Irvine
 */
public class A054876 extends A054875 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x <= mN; ++x) {
      for (long z = mN; z <= 2 * mN; ++z) {
        if (is(x, mN, z)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
