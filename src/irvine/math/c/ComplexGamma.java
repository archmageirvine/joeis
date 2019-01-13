package irvine.math.c;

import irvine.math.r.Constants;

/**
 * Implementation of gamma integral for complex numbers.
 * @author Sean A. Irvine
 */
public final class ComplexGamma {

  // Based on the Lanczos approximation

  private ComplexGamma() { }

  private static final ComplexField CF = ComplexField.SINGLETON;

  private static final C[] COEFF = {
    new C(0.99999999999980993),
    new C(676.5203681218851),
    new C(-1259.1392167224028),
    new C(771.32342877765313),
    new C(-176.61502916214059),
    new C(12.507343278686905),
    new C(-0.13857109526572012),
    new C(9.9843695780195716E-6),
    new C(1.5056327351493116E-7)
  };

  private static final C CONS1 = new C(COEFF.length - 1.5);
  private static final C C_PI = new C(Math.PI);
  private static final C C_SQRT_TAU = new C(Constants.SQRT_TAU);

  static C gamma(final C z) {
    if (z.re() < 0.5) {
      // Apply reflection formula
      return CF.divide(C_PI, CF.multiply(CF.sin(CF.multiply(z, C_PI)), gamma(CF.subtract(C.ONE, z))));
    }
    final C y = CF.subtract(z, C.ONE);
    C x = COEFF[0];
    for (int k = 1; k < COEFF.length; ++k) {
      x = CF.add(x, CF.divide(COEFF[k], CF.add(y, k)));
    }
    final C t = CF.add(y, CONS1);
    return CF.multiply(C_SQRT_TAU, CF.multiply(CF.multiply(CF.pow(t, CF.add(y, C.HALF)), CF.exp(CF.negate(t))), x));
  }
}
