package irvine.oeis.a385;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385614 Numbers of the form x^x + y^y, 1 &lt; x &lt; y.
 * @author Sean A. Irvine
 */
public class A385614 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 3;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.ONE.shiftLeft(mN).add(mN * mN)) > 0) {
      final Z n = Z.valueOf(mN);
      for (long b = 2; b < mN; ++b) {
        final Z bz = Z.valueOf(b);
        mA.add(bz.pow(b).add(n.pow(mN)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
