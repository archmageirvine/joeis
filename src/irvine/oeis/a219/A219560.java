package irvine.oeis.a219;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A219560 Number of tripartite partitions of (n,n,n) into distinct triples.
 * @author Sean A. Irvine
 */
public class A219560 extends Sequence0 {

  private int mN = -1;

  /*
   * Coefficients of prod_{(a,b,c) != (0,0,0)} (1 + x^a y^b z^c).
   */
  private final MemoryFunctionInt3<Z> mT = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int x, final int y, final int z) {
      if (x == 0 && y == 0 && z == 0) {
        return Z.ONE;
      }
      // Differentiate with respect to a nonzero coordinate.
      final int d;
      final int which;
      if (x > 0) {
        d = x;
        which = 0;
      } else if (y > 0) {
        d = y;
        which = 1;
      } else {
        d = z;
        which = 2;
      }

      Z sum = Z.ZERO;
      for (int a = which == 0 ? 1 : 0; a <= x; ++a) {
        for (int b = which == 1 ? 1 : 0; b <= y; ++b) {
          for (int c = which == 2 ? 1 : 0; c <= z; ++c) {
            final int g = Functions.GCD.i(a, b, c);
            final int selected = which == 0 ? a : which == 1 ? b : c;
            /*
             * For a vector (a,b,c), the coefficient in
             *   X d/dX log(prod_v (1 + X^v))
             * is
             *   sum_{r|g} (-1)^(r+1) selected/r.
             */
            long coefficient = 0;
            for (int r = 1; r <= g; ++r) {
              if (g % r == 0) {
                coefficient += (r & 1) == 1
                  ? selected / r
                  : -(selected / r);
              }
            }

            if (coefficient != 0) {
              sum = sum.add(
                mT.get(x - a, y - b, z - c).multiply(coefficient));
            }
          }
        }
      }
      return sum.divide(d);
    }
  };

  @Override
  public Z next() {
    return mT.get(++mN, mN, mN);
  }
}
