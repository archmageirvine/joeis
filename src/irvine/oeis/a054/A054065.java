package irvine.oeis.a054;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.Sort;

/**
 * A054065 Fractal sequence induced by tau: for k &gt;= 1, let p(k) be the permutation of 1,2,...,k obtained by ordering the fractional parts {h*tau} for h=1,2,...,k; then juxtapose p(1),p(2),p(3),...
 * @author Sean A. Irvine
 */
public class A054065 implements Sequence {

  // WARNING: Some precision danger here!

  private static final double PHI = (1 + Math.sqrt(5)) / 2;
  private int mM = 0;
  protected long[] mP = new long[0];

  @Override
  public Z next() {
    if (++mM >= mP.length) {
      mP = Arrays.copyOf(mP, mP.length + 1);
      mP[mP.length - 1] = mP.length;
      final double[] t = new double[mP.length];
      for (int k = 0; k < t.length; ++k) {
        t[k] = (mP[k] * PHI) % 1;
      }
      Sort.sort(t, mP);
      mM = 0;
    }
    return Z.valueOf(mP[mM]);
  }
}
