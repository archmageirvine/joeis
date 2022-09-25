package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059404 Numbers with different exponents in their prime factorizations.
 * @author Sean A. Irvine
 */
public class A059404 implements Sequence {

  private long mN = 11;

  protected boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    int e = -1;
    for (final Z p : fs.toZArray()) {
      if (e == -1) {
        e = fs.getExponent(p);
      } else if (
        fs.getExponent(p) != e) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
