package irvine.math.cc;

import irvine.math.cr.CR;

/**
 * Lambert W_k(z).
 * Uses Halley's method with an asymptotic initial guess.
 */
public final class LambertW {

  private static final ComputableComplexField CF = ComputableComplexField.SINGLETON;
  private static final CC NEG_TWO = new CC(CR.valueOf(-2), CR.ZERO);

  private static CC initialGuess(final CC z, final int branch) {
    final CC L1 = CF.add(CF.log(z), new CC(CR.ZERO, CR.TAU.multiply(CR.valueOf(branch))));
    return CF.subtract(L1, CF.log(L1));
  }

  /*
   * Halley iteration for Lambert W: w_{n+1} = w - f / (f' - f * (w+2) / (2*(w+1))),
   * with f(w)=w*e^w - z and f'(w)=e^w*(w+1).
   */
  private static CC lambertW(final CC z, final int branch, final CR tol) {
    CC w = initialGuess(z, branch);
    while (true) {
      final CC ew = CF.exp(w);
      final CC f = CF.subtract(CF.multiply(w, ew), z); // f = w*e^w - z
      if (CF.abs(f).compareTo(tol) <= 0) {
        break;
      }
      final CC wp1 = CF.add(w, CC.ONE);  // w + 1
      final CC fp = CF.multiply(ew, wp1);   // f' = e^w*(w+1)
      final CC corr = CF.divide(CF.multiply(CF.subtract(w, NEG_TWO), f), CF.multiply(CC.TWO, wp1)); // f*(w+2)/(2*(w+1))
      final CC denom = CF.subtract(fp, corr);  // f' - ...
      final CC step = CF.divide(f, denom);
      w = CF.subtract(w, step);
    }
    return w;
  }

  /**
   * Compute the Lambert W function of <code>z</code>
   * @param z argument
   * @param branch branch
   */
  public static CC lambertW(final CC z, final int branch, final int precision) {
    return lambertW(z, branch, CR.TWO.pow(precision));
  }
}
