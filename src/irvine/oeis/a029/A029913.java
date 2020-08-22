package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029913 Start with n; if prime, stop; repeatedly sum squares of prime factors (counted with multiplicity), until reach 16 or a prime; set a(n) = 0 if no limit exists.
 * @author Sean A. Irvine
 */
public class A029913 implements Sequence {

  private static final Z SIXTEEN = Z.valueOf(16);
  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));
  private Z mN = Z.ONE;

  static Z sopfrSquares(final FactorSequence fs) {
    if (VERBOSE) {
      System.out.println(FactorSequence.toString(fs));
    }
    Z s = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s = s.add(p.square().multiply(fs.getExponent(p)));
    }
    return s;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    while (!m.isProbablePrime() && !SIXTEEN.equals(m)) {
      final Z prev = m;
      m = sopfrSquares(Jaguar.factor(m));
      if (m.equals(prev)) {
        return Z.ZERO; // loop detected (note there could be other loops not detected here!)
      }
    }
    return m;
  }
}
