package irvine.oeis.a085;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085869 Numbers n such that n and its digit reversal have the same prime signature.
 * @author Sean A. Irvine
 */
public class A085869 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(LongUtils.reverse(mN));
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
