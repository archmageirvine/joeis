package irvine.oeis.a038;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038841 Concatenation of prime factors of n is a cube.
 * @author Sean A. Irvine
 */
public class A038841 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Z[] mWork = new Z[100]; // 2^100 way higher than we will need
  private long mN = 2;
  private Z mCube = Z.EIGHT;
  private Z mLimit = mCube.sqrt();
  private Z mPrev = Z.ZERO;

  private void augment(final String s, final int pos, final Z p) {
    if (s.isEmpty()) {
      Z prod = Z.ONE;
      for (int k = 0; k < pos; ++k) {
        prod = prod.multiply(mWork[k]);
      }
      if (prod.compareTo(mPrev) > 0) {
        mA.add(prod);
      }
      return;
    }
    if (s.charAt(0) == '0') {
      return;
    }
    for (int k = s.length(); k > 0; --k) {
      final Z t = new Z(s.substring(0, k));
      if (t.compareTo(p) >= 0 && t.isProbablePrime()) {
        mWork[pos] = t;
        augment(s.substring(k), pos + 1, t);
      }
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mLimit) > 0) {
      augment(mCube.toString(), 0, Z.ZERO);
      mCube = Z.valueOf(++mN).pow(3);
      mLimit = mCube.sqrt();
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
