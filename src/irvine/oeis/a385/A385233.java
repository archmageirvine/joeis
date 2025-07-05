package irvine.oeis.a385;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078523.
 * @author Sean A. Irvine
 */
public class A385233 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 4;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.ONE.shiftLeft(mN).add(mN * mN)) > 0) { // This condition could be made tighter
      final Z n = Z.valueOf(mN);
      for (long b = 3; b < mN; ++b) {
        final Z bz = Z.valueOf(b);
        for (long a = 2; a < b; ++a) {
          final Z az = Z.valueOf(a);
          mA.add(az.pow(a).add(bz.pow(b)).add(n.pow(mN)));
          mA.add(az.pow(a).add(bz.pow(mN)).add(n.pow(b)));
          mA.add(az.pow(b).add(bz.pow(a)).add(n.pow(mN)));
          mA.add(az.pow(b).add(bz.pow(mN)).add(n.pow(a)));
          mA.add(az.pow(mN).add(bz.pow(b)).add(n.pow(a)));
          mA.add(az.pow(mN).add(bz.pow(a)).add(n.pow(b)));
        }
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
