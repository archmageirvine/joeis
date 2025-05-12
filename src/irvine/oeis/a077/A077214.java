package irvine.oeis.a077;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077214 a(1) = 1. a(n+1) is the smallest number which is greater than a(n), coprime to it and has a different prime signature.
 * @author Sean A. Irvine
 */
public class A077214 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA;
    final int[] signature = FactorUtils.sortedPrimeSignature(t);
    while (true) {
      mA = mA.add(1);
      if (Functions.GCD.z(t, mA).isOne() && !Arrays.equals(signature, FactorUtils.sortedPrimeSignature(mA))) {
        return mA;
      }
    }
  }
}

