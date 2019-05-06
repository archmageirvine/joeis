package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A069014 Integers n at which the difference between <code>e^(Pi*sqrt(n))</code> and its nearest integer is a new minimum.
 * @author Sean A. Irvine
 */
public class A069014 implements Sequence {

  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR z = CR.PI.multiply(CR.valueOf(++mN).sqrt()).exp();
      final CR frac = CR.valueOf(z.add(CR.HALF).floor()).subtract(z).abs();
      if (frac.compareTo(mBest) < 0) {
        mBest = frac;
        return Z.valueOf(mN);
      }
    }
  }
}

