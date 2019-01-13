package irvine.math.c;

import irvine.math.r.Constants;

/**
 * Implementation of exponential integral for complex numbers.
 * @author Sean A. Irvine
 */
public final class ComplexEi {

  // Based on "On the Evaluation of the Complex-Valued Exponential Integral"
  // by Vincent Pegoraro and Philipp Slusallek

  private ComplexEi() { }

  private static final ComplexField CF = ComplexField.SINGLETON;
  private static final double DIST = 1;
  private static final double MAX_ERROR = 1e-16;
  private static final double ASYMPTOTIC_SWITCH_LIMIT = 2 - 1.035 * Math.log(MAX_ERROR);

  private static boolean isConverged(final C ei, final C old) {
    final C diff = CF.subtract(ei, old);
    return Math.abs(diff.re()) <= MAX_ERROR * Math.abs(ei.re())
      && Math.abs(diff.im()) <= MAX_ERROR * Math.abs(ei.im());
  }

  private static C eiPowerSeries(final C z) {
    C ei = new C(Constants.EULER + Math.log(CF.abs(z)), Math.signum(z.im()) * Math.abs(CF.arg(z)));
    C tmp = C.ONE;
    for (int k = 1; true; ++k) {
      final C ck = new C(k);
      tmp = CF.multiply(tmp, CF.divide(z, ck));
      final C old = ei;
      ei = CF.add(ei, CF.divide(tmp, ck));
      if (isConverged(ei, old)) {
        break;
      }
    }
    return ei;
  }

  private static C eiContinuedFractionForward(final C z) {
    final C expz = CF.exp(z);
    final C zz = CF.subtract(C.ONE, z);
    C ei = new C(0, Math.signum(z.im()) * Math.PI);
    C d = CF.inverse(zz);
    C c;
    if (!C.ZERO.equals(ei)) {
      c = CF.inverse(ei);
      c = CF.inverse(CF.subtract(zz, CF.multiply(expz, c)));
      ei = CF.multiply(ei, CF.divide(d, c));
    } else {
      c = C.ZERO;
      ei = CF.multiply(CF.negate(expz), d);
    }
    for (int k = 1; true; ++k) {
      final double kk = k * k;
      final C kkz = CF.add(new C(2 * k), zz);
      c = CF.inverse(CF.subtract(kkz, CF.multiply(c, kk)));
      d = CF.inverse(CF.subtract(kkz, CF.multiply(d, kk)));
      final C old = ei;
      ei = CF.multiply(ei, CF.divide(d, c));
      if (isConverged(ei, old)) {
        break;
      }
    }
    return ei;
  }

  /* // only useful when number of required iterations known in advance
  private static C eiContinuedFractionBackward(final C z) {
    C ei = C.ZERO;
    for (int k = MAX_ITERATIONS; k >= 1; --k) {
      ei = CF.divide(new C(-k * k), CF.add(CF.subtract(ei, z), new C(2 * k + 1)));
    }
    ei = CF.subtract(new C(0, Math.signum(z.im()) * Math.PI), CF.divide(CF.exp(z), CF.add(CF.subtract(C.ONE, z), ei)));
    return ei;
  }
  */

  private static C eiAsymptoticSeries(final C z) {
    C ei = new C(0, Math.signum(z.im()) * Math.PI);
    C tmp = CF.divide(CF.exp(z), z);
    for (long k = 1; k <= Math.floor(CF.abs(z)) + 1; ++k) {
      final C old = ei;
      ei = CF.add(ei, tmp);
      if (isConverged(ei, old)) {
        return ei;
      }
      tmp = CF.multiply(tmp, CF.divide(new C(k), z));
    }
    return null;
  }



  /**
   * Exponential integral.  Normally accessed by the <code>ComplexField</code> class.
   * @param z argument
   * @return exponential integral of <code>z</code>
   */
  static C ei(final C z) {
    final double mod = CF.abs(z);
    if (mod == Double.POSITIVE_INFINITY) {
      return CF.add(new C(0, Math.signum(z.im()) * Math.PI), CF.divide(CF.exp(z), z));
    }
    if (mod > ASYMPTOTIC_SWITCH_LIMIT) {
      final C ei = eiAsymptoticSeries(z);
      if (ei != null) {
        return ei;
      }
    }
    if (mod > DIST && (z.re() < 0 || Math.abs(z.im()) > DIST)) {
      return eiContinuedFractionForward(z);
      //return eiContinuedFractionBackward(z);
    }
    if (mod > 0) {
      return eiPowerSeries(z);
    }
    return new C(Double.NaN);
  }

}
