package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061381 Smallest "inconsummate number" in base n greater than in the previous base.
 * @author Sean A. Irvine
 */
public class A061381 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      long k = mM;
      final long limit = 10 * mN * mM; // heuristic?
      while (Functions.DIGIT_SUM.l(mN, k) * mM != k && k < limit) {
        k += mM;
      }
      if (k != limit) {
        ++mM;
      } else {
        return Z.valueOf(mM);
      }
    }
  }
}

