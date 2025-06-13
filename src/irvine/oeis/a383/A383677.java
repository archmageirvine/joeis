package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A383677 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A383677 extends Sequence2 {

  private long mN = 2;
  private long mM = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_LENGTH.l(Functions.PRIMORIAL_COUNT.z(++mM)) >= mN + 1) {
        ++mN;
        mM = 3;
      }
      Z k = Z.TEN.pow(mN - 1);
      final Z lim = k.multiply(10);
      while (k.compareTo(lim) < 0) {
        if (Functions.OMEGA.l(k) == mM && 2 * Functions.GPF.l(k) == Functions.SOPF.l(k)) {
          return k;
        }
        k = k.add(1);
      }
      //System.out.println("Limit failed: " + mN + " " + mM); // todo Rebert's bounds are still wrong because this does happen
    }
  }
}

