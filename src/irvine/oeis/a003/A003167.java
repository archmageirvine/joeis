package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;
import java.util.Map;

/**
 * A003167 Number of n-dimensional cuboids with integral edge lengths for which volume = surface area.
 * @author Sean A. Irvine
 */
public class A003167 implements Sequence {

  // Takes about 10 minutes to compute through to a(6)

  private int mDimensions = 1;

  private long mCount = 0;

  // Let the variables for the dimensions be x0 x1 x2 ... xn
  // The volume is then product x_i.
  // The surface area is 2*sum(product(x_i)/x_j,j=0..n) (i.e. leave one variable out)
  // We require volume = surface area

  private Z count(final long volVars, final Map<Long, Q> surfaceArea, final Z prevMin) {
    // Basic idea is to eliminate one variable at each stage
    if (volVars == 1) {
      // We have an equation like x = c + kx. Thus x = c / (1+k) needs to be an integer
      assert surfaceArea.size() == 1;
      final Q c = surfaceArea.get(0L);
      if (c.signum() > 0 && c.isInteger() && c.toZ().compareTo(prevMin) >= 0) {
        ++mCount;
      }
      return c.toZ();
    } else {
      // We need to eliminate another variable
      final long toEliminate = Long.highestOneBit(volVars);
      final long newVolVars = volVars & ~toEliminate; // Equiv. volVars >>>= 1
      final Q areaCoeff = surfaceArea.get(newVolVars);
      final Z s = areaCoeff.add(1).toZ();
      Z k = prevMin.max(s);
      while (true) {
        // Substitute variable toEliminate with integer value k
        final Q leftCoeff = new Q(k).subtract(areaCoeff);
        final HashMap<Long, Q> newCoeffs = new HashMap<>();
        for (final Map.Entry<Long, Q> e : surfaceArea.entrySet()) {
          final long vars = e.getKey();
          if (vars != newVolVars) {
            final long newVars = vars & ~toEliminate;
            final Q coeff = e.getValue();
            if ((vars & toEliminate) != 0) {
              // Substitute toEliminate with k
              newCoeffs.put(newVars, coeff.multiply(k).divide(leftCoeff));
            } else {
              // There is no variable toEliminate in this term
              newCoeffs.put(vars, coeff.divide(leftCoeff));
            }
          }
        }
        final Z max = count(newVolVars, newCoeffs, k);
        if (k.compareTo(max) > 0) {
          return max;
        }
        k = k.add(1);
      }
    }
  }

  private Map<Long, Q> init(final int d) {
    final HashMap<Long, Q> coeffs = new HashMap<>();
    final long all = (1L << d) - 1;
    for (long leaveOut = 1; leaveOut < all; leaveOut <<= 1) {
      coeffs.put(all & ~leaveOut, Q.TWO);
    }
    return coeffs;
  }

  @Override
  public Z next() {
    ++mDimensions;
    mCount = 0;
    count((1L << mDimensions) - 1, init(mDimensions), Z.ZERO);
    return Z.valueOf(mCount);
  }
}
