package irvine.oeis.a052;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A052214 Numbers n with prime signature(n) = prime signature(n+1) = prime signature(n+2).
 * @author Sean A. Irvine
 */
public class A052214 extends A052213 {

  @Override
  public Z next() {
    while (true) {
      final Z mN = super.next();
      final FactorSequence fs0 = Jaguar.factor(mN);
      final FactorSequence fs1 = Jaguar.factor(mN.add(2));
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
          return mN;
        }
      }
    }
  }
}
