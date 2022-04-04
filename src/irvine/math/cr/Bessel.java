package irvine.math.cr;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Bessel functions.
 * @author Sean A. Irvine
 */
public final class Bessel  {

  private Bessel() { }

  private static final int EXTRA_PRECISION = 3;

  static CR besselI0(final CR z) {
    // Expansion: Sum_{k>=0} (((z/2)^2)^k / (k!)^2.
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = CR.ONE.getApprox(p); // k = 0
        Z sum = term;
        long k = 0;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k * k);
          if (term.isZero()) {
            break;
          }
          sum = sum.add(term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    };
  }

  // Note: it would be straight-forward to generalize this to CR v
  static CR besselI(final int v, final CR z) {
    if (v == 0) {
      return besselI0(z);
    }
    // Expansion: (z/2)^v * Sum_{k>=0} (((z/2)^2)^k / (k! * (v+k+1)!).
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = CR.ONE.getApprox(p).divide(MemoryFactorial.SINGLETON.factorial(v)); // k = 0
        Z sum = term;
        long k = 0;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k).divide(v + k);
          if (term.isZero()) {
            break;
          }
          sum = sum.add(term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.multiply(z.divide(CR.TWO).pow(v));
  }

  static CR besselJ0(final CR z) {
    // Expansion: Sum_{k>=0} ((-)^k*((x/2)^2)^k/(k!)^2.
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = CR.ONE.getApprox(p); // k = 0
        Z sum = term;
        long k = 0;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k * k);
          if (term.isZero()) {
            break;
          }
          sum = sum.signedAdd((k & 1) == 0, term);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    };
  }

  static CR besselK0(final CR z) {
    // Expansion: -ln(z/2) * I_0(z) + Sum_{k>=0} (z^(2k) / (2^(2k)*(k!)^2)) * psi(k+1)
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z sum = Psi.psi(1).getApprox(p); // k = 0
        Z term = scale(Z.ONE, -p);
        int k = 0;
        while (!term.isZero()) {
          term = scale(term.multiply(z2approx), p).divide(++k * (long) k);
          final Z t = scale(term.multiply(Psi.psi(k + 1).getApprox(p)), p);
          sum = sum.add(t);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.subtract(besselI0(z).multiply(z.divide(CR.TWO).log()));
  }

  static CR besselK(final int v, final CR z) {
    if (v == 0) {
      return besselK0(z);
    }

    final CR z2f = z.multiply(z).divide(CR.FOUR);
    final CR z2fn = z2f.negate();
    CR sum1 = CR.ZERO;
    CR zp = CR.ONE;
    for (int k = 0; k < v; ++k, zp = zp.multiply(z2fn)) {
      sum1 = sum1.add(zp.multiply(MemoryFactorial.SINGLETON.factorial(v - k - 1)).divide(CR.valueOf(MemoryFactorial.SINGLETON.factorial(k))));
    }
    sum1 = sum1.multiply(CR.HALF).multiply(CR.TWO.divide(z).pow(v));

    final CR sum2 = new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z2f.getApprox(p);
        Z sum = Psi.psi(1).add(Psi.psi(v + 1)).getApprox(p).divide(MemoryFactorial.SINGLETON.factorial(v)); // k = 0
        Z term = scale(Z.ONE, -p).divide(MemoryFactorial.SINGLETON.factorial(v));
        int k = 0;
        while (!term.isZero()) {
          term = scale(term.multiply(z2approx), p).divide(++k).divide(v + k);
          final Z t = scale(term.multiply(Psi.psi(k + 1).add(Psi.psi(v + k + 1)).getApprox(p)), p);
          sum = sum.add(t);
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.multiply(CR.HALF).multiply(z.divide(CR.TWO).pow(v));

    return ComputableReals.SINGLETON.signedAdd((v & 1) == 0,
      ComputableReals.SINGLETON.signedAdd((v & 1) == 1,
        sum1, besselI(v, z).multiply(z.divide(CR.TWO).log())),
      sum2);
  }

  static CR besselY0(final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z z2approx = z.multiply(z).divide(CR.FOUR).getApprox(p);
        Z term = z2approx;
        Z sum = term;
        Q harmonic = Q.ONE;
        long k = 1;
        while (true) {
          term = scale(term.multiply(z2approx), p).divide(++k * k);
          if (term.isZero()) {
            break;
          }
          harmonic = harmonic.add(new Q(1, k));
          sum = sum.signedAdd((k & 1) == 1, harmonic.multiply(term).toZ());
        }
        return scale(sum, -EXTRA_PRECISION);
      }
    }.add(z.divide(CR.TWO).log().add(CR.GAMMA).multiply(besselJ0(z))).multiply(CR.TWO).divide(CR.PI);
  }
}
