package irvine.oeis.a059;

import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;

import irvine.math.z.Z;

/**
 * A059757 Initial terms of smallest Erd\u0151s-Woods intervals corresponding to the terms of A059756.
 * @author Sean A. Irvine
 */
public class A059757 extends A059756 {

  private Z findMin(final int n) {
    try {
      final ISolver solver = new ModelIterator(buildSolver(n));
      Z res = null;
      while (solver.isSatisfiable()) {
        Z p0 = Z.ONE;
        Z p1 = Z.ONE;
        long p = 2;
        int k = 1;
        final int[] model = solver.model();
        //System.out.println(n + " model " + Arrays.toString(model));
        if (model[0] > 0) { // symmetry breaking
          for (int j = 0; j < model.length; j += 2) {
            final int m = model[j];
            if (j + 1 < model.length && m * model[j + 1] > 0) {
              continue; // this prime not needed, i.e. m and model[j+1] have same sign
            }
            if ((m & 1) == 0) {
              while (Math.abs(m / 2) > k) {
                p = mPrime.nextPrime(p);
                ++k;
              }
              if (m > 0) {
                p0 = p0.multiply(p);
              } else {
                p1 = p1.multiply(p);
              }
            }
          }
          final Z[] e = p0.negate().extendedGcd(p1);
          final Z e1 = e[1].multiply(n).multiply(p0).mod(p0.multiply(p1));
          final Z e2 = e[2].multiply(n).multiply(p1).mod(p0.multiply(p1));
          final Z soln = e1.min(e2);
          //System.out.println("soln: " + e1 + " " + e2);
          //System.out.println("p0=" + p0 + " p1=" + FactorSequence.toString(fs) + " " + fs.product() + " " + p1);
          if (res == null || soln.compareTo(res) < 0) {
            res = soln;
          }
        }
      }
      return res;
    } catch (final TimeoutException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Z next() {
    return findMin(super.next().intValueExact());
  }
}
