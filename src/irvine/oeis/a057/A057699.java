package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A057699 Primes whose reversal is a cube.
 * @author Sean A. Irvine
 */
public class A057699 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 3;
  private Z mLimit = Z.TEN;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLimit = mLimit.multiply(10);
      Z cube;
      while ((cube = Z.valueOf(mN).pow(3)).compareTo(mLimit) < 0) {
        if (cube.mod(10) != 0) {
          final Z rev = ZUtils.reverse(cube);
          if (rev.isProbablePrime()) {
            mA.add(rev);
          }
        }
        ++mN;
      }
    }
    return mA.pollFirst();
  }
}
