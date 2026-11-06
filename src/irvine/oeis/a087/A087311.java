package irvine.oeis.a087;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087311 a(1) = 2; for n&gt;1, a(n) = smallest number == 1 (mod a(n-1)) with a prime signature of n.
 * @author Sean A. Irvine
 */
public class A087311 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mN == 1) {
      mA = Z.TWO;
      return mA;
    }
    final int[] sig = FactorUtils.primeSignature(Z.valueOf(mN));
    //System.out.println(Arrays.toString(sig));
    if (sig.length == 1 && sig[0] == 2) {
      // want x^2 == 1 (mod mA)
      Z min = null;
      for (Z x : QuadraticCongruence.solve(Z.ONE, Z.ZERO, Z.NEG_ONE, mA)) {
        while (x.square().compareTo(mA) < 0 || !Arrays.equals(FactorUtils.primeSignature(x.square()), sig)) {
          x = x.add(mA);
        }
        final Z x2 = x.square();
        if (min == null || x2.compareTo(min) < 0) {
          min = x2;
        }
      }
      mA = min;
      return mA;
    }
    if (sig.length == 1 && sig[0] > 1) {
      Z p = Functions.NEXT_PRIME.z(mA);
      while (!p.modPow(sig[0], mA).isOne()) {
        p = Functions.NEXT_PRIME.z(p);
      }
      mA = p.pow(sig[0]);
      return mA;
    }
    final Z m = mA;
    mA = mA.add(1);
    while (true) {
      final int[] s = FactorUtils.primeSignature(mA);
      if (Arrays.equals(s, sig)) {
        return mA;
      }
      mA = mA.add(m);
    }
  }
}

