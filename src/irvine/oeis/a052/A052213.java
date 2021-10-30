package irvine.oeis.a052;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052213 Numbers k with prime signature(k) = prime signature(k+1).
 * @author Sean A. Irvine
 */
public class A052213 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Cheetah.factor(++mN);
      final FactorSequence fs1 = Cheetah.factor(mN + 1);
      if (fs0.omega() == fs1.omega()) {
        final int[] a = new int[fs0.omega()];
        final int[] b = new int[fs0.omega()];
        int k = 0;
        for (final Z p : fs0.toZArray()) {
          a[k++] = fs0.getExponent(p);
        }
        k = 0;
        for (final Z p : fs1.toZArray()) {
          b[k++] = fs1.getExponent(p);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
