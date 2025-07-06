package irvine.oeis.a173;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A173054 Numbers of the form x^y + y^x, 1 &lt; x &lt; y.
 * @author Sean A. Irvine
 */
public class A173054 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 3;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.ONE.shiftLeft(mN).add(mN * mN)) > 0) {
      final Z n = Z.valueOf(mN);
      for (long b = 2; b < mN; ++b) {
        final Z bz = Z.valueOf(b);
        mA.add(bz.pow(mN).add(n.pow(b)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
