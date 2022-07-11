package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002410 Nearest integer to imaginary part of n-th zero of Riemann zeta function.
 * @author Sean A. Irvine
 * @author Raymond Manzoni
 */
public class A002410 implements Sequence {

  // WARNING: This might not have sufficient accuracy, cf. A162774 diff

  private static final double ROOT_1 = 14.13472514;

  //============== Riemann-Siegel formula ===============================
  // Ref : H.M. Edwards fine 'Riemann's zeta function' Dover (153f)
  // for C code and details see Glen Pugh's master thesis : 'The Riemann-Siegel
  // formula and large scale computation of the Riemann zeta function' at :
  // http://www.math.ubc.ca/~pugh (he has an applet too for this function)
  // for more advanced topics see Andrew Odlyzko's papers at
  // http://www.dtc.umn.edu/~odlyzko/

  // set A0  An:= series(exp(2*PI*I*y^2),y);  //to Order 40 for example
  // iterate An:= series(-1/2*y*expr(An)-1/(32*PI^2)*diff(expr(An)/y,y $2),y); //A1,A2..
  // compute series(An*sum(Psi^(m)*y^m/m!,m=0..16),y);
  // keeping the real part of the constant term should give the n case below
  // (coeff obtained by expanding the Taylor series around (z+1)/2)

  // Psi(p)= cos(2*pi*(p^2-p-1/16))/cos(2*pi*p)
  // Psi:=count(cos(2*PI*((p^2-p)-1/16))/cos(2*PI*p),p);

  private static final PolynomialRingField<CR> RING = new PolynomialRingField<>(ComputableReals.SINGLETON);
  private static final Polynomial<CR> SIXTEENTH = RING.monomial(CR.valueOf(new Q(1, 16)), 0);
  private static final CR TAU2 = CR.TAU.multiply(CR.TAU);
  private static final CR TAU4 = TAU2.multiply(TAU2);
  private static final CR TAU6 = TAU4.multiply(TAU2);
  private static final CR TAU8 = TAU4.multiply(TAU4);
  private static final CR TAU10 = TAU8.multiply(TAU2);
  private static final CR TAU12 = TAU6.multiply(TAU6);
  private static final CR C1 = TAU2.multiply(CR.THREE).inverse();
  private static final CR C2A = TAU4.multiply(18).inverse();
  private static final CR C2B = TAU2.multiply(CR.FOUR).inverse();
  private static final CR C3A = TAU6.multiply(162).inverse();
  private static final CR C3B = TAU4.multiply(new Q(15, 2)).inverse();
  private static final CR C3C = TAU2.multiply(8).inverse();
  private static final CR C4A = TAU8.multiply(1944).inverse(); // 2^3 * 3^5
  private static final CR C4B = TAU6.multiply(new Q(360, 11)).inverse(); // 2^3 * 3^2 * 5 / 11
  private static final CR C4C = TAU4.multiply(new Q(96, 19)).inverse();
  private static final CR C4D = TAU2.multiply(32).inverse();
  private static final CR C5A = TAU10.multiply(29160).inverse(); // 2^3 * 3^6 * 5
  private static final CR C5B = TAU8.multiply(new Q(1620, 7)).inverse();
  private static final CR C5C = TAU6.multiply(new Q(10080, 901)).inverse();
  private static final CR C5D = TAU4.multiply(new Q(13824, 2879)).inverse();
  private static final CR C6A = TAU12.multiply(524880).inverse();
  private static final CR C6B = TAU10.multiply(new Q(38880, 17)).inverse();
  private static final CR C6C = TAU8.multiply(new Q(907200, 18889)).inverse();
  private static final CR C6D = TAU6.multiply(new Q(414720, 79267)).inverse();
  private static final CR C6E = TAU4.multiply(new Q(18432, 2879)).inverse();
  private static final int TERMS = 23;

  private static Polynomial<CR> psi(final Polynomial<CR> p, final int n) {
    final Polynomial<CR> a = RING.subtract(RING.subtract(RING.pow(p, 2, n), p), SIXTEENTH);
    final Polynomial<CR> num = RING.cos(RING.multiply(a, CR.TAU), n);
    final Polynomial<CR> den = RING.cos(RING.multiply(p, CR.TAU), n);
    return RING.series(num, den, n);
  }

  private static double[][] initTableC() {
    final double[][] table = new double[7][TERMS];
    final ArrayList<Polynomial<CR>> derivatives = new ArrayList<>();
    derivatives.add(psi(RING.create(Arrays.asList(CR.HALF, CR.HALF)), 70));
    for (int k = 1; k <= 18; ++k) {
      derivatives.add(RING.diff(derivatives.get(k - 1)));
    }
    for (int k = 0; k < TERMS; ++k) {
      final int u = 2 * k;
      final int v = 2 * k + 1;
      table[0][k] = derivatives.get(0).coeff(u).doubleValue();
      table[1][k] = derivatives.get(3).coeff(v).multiply(C1).doubleValue();
      table[2][k] = derivatives.get(6).coeff(u).multiply(C2A).add(derivatives.get(2).coeff(u).multiply(C2B)).doubleValue();
      table[3][k] = -derivatives.get(9).coeff(v).multiply(C3A).add(derivatives.get(5).coeff(v).multiply(C3B))
        .add(derivatives.get(1).coeff(v).multiply(C3C)).doubleValue();
      table[4][k] = derivatives.get(12).coeff(u).multiply(C4A).add(derivatives.get(8).coeff(u).multiply(C4B))
        .add(derivatives.get(4).coeff(u).multiply(C4C)).add(derivatives.get(0).coeff(u).multiply(C4D)).doubleValue();
      table[5][k] = -derivatives.get(15).coeff(v).multiply(C5A).add(derivatives.get(11).coeff(v).multiply(C5B))
        .add(derivatives.get(7).coeff(v).multiply(C5C)).add(derivatives.get(3).coeff(v).multiply(C5D)).doubleValue();
      table[6][k] = derivatives.get(18).coeff(u).multiply(C6A).add(derivatives.get(14).coeff(u).multiply(C6B))
        .add(derivatives.get(10).coeff(u).multiply(C6C)).add(derivatives.get(6).coeff(u).multiply(C6D))
        .add(derivatives.get(2).coeff(u).multiply(C6E)).doubleValue();
    }
    return table;
  }

  private static double[][] sTableC = null;

  // C coeff for Riemann-Siegel formula
  private static double coeff(final int n, final double z) {
    if (sTableC == null) {
      sTableC = initTableC();
    }
    final double z2 = z * z;
    final double[] table = sTableC[n];
    double s = 0;
    double p = (n & 1) != 0 ? z : 1;
    for (final double k : table) {
      s += k * p;
      p *= z2;
    }
    return s;
  }

  // theta(t)=Im{log[Pi(it/2-3/4)]}-t/2*log(pi)
  // using the approximate
  // t/2*(log(t/(2*Pi))-1)-Pi/8+1/(48*t)+7/(5760*t^3)+31/(80640*t^5)+127/(430080*t^7)+511/(1216512*t^9)
  // +1414477/(1476034560*t^11)+1898482392450447133975223/(2642676384606731475419894*t^13)
  // should not be called for t<=10 (absolute error of order 4*10^(-9))
  static double theta(final double t) {
    final double l = Math.log(t * Constants.INV_TAU) - 1;
    return t * 0.5 * l - Math.PI / 8.0 + 1.0 / (48.0 * t) + 7.0 / (5760.0 * t * t * t);
  }

  // Riemann-Siegel Z function (0<=n<6)
  // precision smaller for t<100 (t>10^6 ?) (m=6 recommended)
  private static double riemannSiegelZ(final double t, final int m) {

    /*
    if (t < 14.0) {
      if (t < -14.0) {
        return riemannSiegelZ(-t, m);
      }
      // in [-14,14] Euler-MacLaurin is more accurate
      final int dec = m >= 6 ? 10 : 7;
      return -CF.abs(eulerMacLaurin(new C(0.5, t), dec));
    }
    */

    // SAI: The following goes roughly in line with the zeros, but is not
    // correct even for the second zero!  Indeed the eulerMacLaurin above
    // gets closer, but it is also wrong ...

    double x = Math.sqrt(t * Constants.INV_TAU); // sqrt(t/(2*pi))
    final int n = (int) x;                      // int(sqrt(t/(2*pi)))
    final double tt = theta(t);
    double zz = Math.cos(tt);   // Handle k = 1
    int k = 1;
    while (++k <= n) {
      zz += Math.cos(tt - t * Math.log(k)) / Math.sqrt(k);
    }
    zz *= 2;
    // Compute R term
    final double ip = 1.0 / x ;                 // sqrt(2*pi/t)
    final double sip = Math.sqrt(ip);           // (2*pi/t)^(1/4)
    x -= n;                                     // frac(sqrt(t/(2*pi)))
    x = 2.0 * x - 1;                              // in [-1,1)
    double po = 1;
    double r = 0;
    k = -1;
    while (++k <= m) {
      r += coeff(k, x) * po;
      po *= ip;
    }
    if ((n & 1) != 0) {
      return zz + r * sip;
    } else {
      return zz - r * sip;
    }
  }

  protected double mYRef = 0;

  private void findNextZero() {
    // Start near the selected point
    if (mYRef < ROOT_1) {
      mYRef = ROOT_1;
      return;
    }
    // We could use Gram points too but...
    double st = mYRef;
    double inc = 1.0 / (16.0 * Math.log(Math.abs(st)));
    st += inc;
    double zz = riemannSiegelZ(st, 6); // full precision
    while (Math.abs(zz) < 1e-7) { // near a zero?
      st += inc;
      zz = riemannSiegelZ(st, 6);
    }
    inc *= 8; //faster far from zero
    double z = st;
    double nz = zz;
    final double iz = zz;
    final double incLim = inc / 1024.0;
    zz = riemannSiegelZ(st - inc, 6);
    do {
      z += inc;
      final double pz = zz;
      zz = nz;
      nz = riemannSiegelZ(z, 6);
      // extremum handling (=> pb. not R.H. false but...)
      // more precision is required (near 17143 for example)
      if ((pz > zz && zz <= nz && zz >= 0 || // positive minimum
           pz < zz && zz >= nz && zz < 0) && // negative maximum
           zz != iz) { // out of attraction of starting point!
        inc *= 0.5;
        z -= 3 * inc;
        zz = pz;
        nz = riemannSiegelZ(z, 6);
        if (Math.abs(inc) < Math.abs(incLim)) {
          break; // minimum (R.H. false or out of precision...)
        }
      }
    } while (nz * zz > 0);
    if (Math.abs(inc) < Math.abs(incLim)) {
      // abnormal minimum or maximum !!!
      mYRef = z;
    } else {
      // use interpolation
      double z1 = z - inc;
      double zz1 = riemannSiegelZ(z1, 6);
      double z2 = z;
      double zz2 = nz;
      int cpt = 100; // security limit
      do {
        z = z1 + zz1 * (z2 - z1) / (zz1 - zz2);
        nz = riemannSiegelZ(z, 6); // full precision
        if (nz * zz1 < 0) {
          z2 = z;
          zz2 = nz;
        } else if (nz * zz2 < 0) {
          z1 = z;
          zz1 = nz;
        } else {
          break;
        }
        --cpt;
      } while (Math.abs(nz) > 1e-8 && zz1 != zz2 && cpt >= 0);
      mYRef = z;
    }
  }

  /*
  private void dump(final double zero) {
    System.out.println("Considering: " + zero);
    System.out.println(riemannSiegelZ(zero - 0.001, 6));
    System.out.println(riemannSiegelZ(zero, 6));
    System.out.println(riemannSiegelZ(zero + 0.001, 6));
  }
  */

  @Override
  public Z next() {
    //dump(ROOT_1);
    //dump(21.02203963877155499);
    //dump(25.0108575801456887632);
    findNextZero();
    //System.out.println("Zero = " + mYRef);
    return Z.valueOf(Math.round(mYRef));
  }

}
