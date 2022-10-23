package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027874 Minimal degree path length of a tree with n leaves.
 * @author Sean A. Irvine
 */
public class A027874 extends Sequence1 {

  // After Jean-Fran&ccedil;ois Alcover

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long q = 0;
    long t;
    long u = 1;
    while (true) {
      ++q;
      t = u;
      u *= 3;
      if (2 * t <= mN && mN <= u) {
        return Z.valueOf(3 * q * mN + 2 * (mN - u));
      }
      if (u <= mN && mN <= 2 * u) {
        return Z.valueOf(3 * q * mN + 4 * (mN - u));
      }
    }
  }
}
