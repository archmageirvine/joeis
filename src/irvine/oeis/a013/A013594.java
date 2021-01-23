package irvine.oeis.a013;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A013594 Smallest order of cyclotomic polynomial containing n or -n as a coefficient.
 * @author Sean A. Irvine
 */
public class A013594 implements Sequence {

  private static final int MAX_COEFF = 1000000; // Way more terms than we can hope to do by this method
  private static final Z ZMAX_COEFF = Z.valueOf(MAX_COEFF);
  private final int[] mFirstOccurrence = new int[MAX_COEFF];
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    while (mFirstOccurrence[mN] == 0) {
      final Polynomial<Z> cyclo = Cyclotomic.cyclotomic(++mM);
      for (final Z c : cyclo) {
        final Z coeff = c.abs();
        if (coeff.compareTo(ZMAX_COEFF) < 0) {
          final int d = coeff.intValue();
          if (mFirstOccurrence[d] == 0) {
            mFirstOccurrence[d] = mM;
          }
        }
      }
    }
    return Z.valueOf(mFirstOccurrence[mN]);
  }
}
