package irvine.oeis.a073;

import java.util.Arrays;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A073913 Number of staircase polygons on the square lattice with perimeter 2n and one (possibly rotated) staircase polygonal hole.
 * @author Sean A. Irvine
 */
public class A073913 extends AbstractSequence {

  /** Construct the sequence. */
  public A073913() {
    super(8);
  }

  private static final PolynomialRingField<CR> RING = new PolynomialRingField<>(ComputableReals.SINGLETON);
  private static final Polynomial<CR> TWO = RING.create(List.of(CR.TWO));
  private static final Polynomial<CR> F1N = RING.create(Arrays.asList(CR.ONE, CR.valueOf(-8), CR.valueOf(16), CR.valueOf(-4)));
  private static final Polynomial<CR> F1D = RING.create(Arrays.asList(CR.ONE, CR.valueOf(-4)));
  private static final Polynomial<CR> F2N = RING.create(Arrays.asList(CR.ONE, CR.valueOf(-6), CR.SIX));
  private static final Polynomial<CR> F3N = RING.create(Arrays.asList(CR.THREE, CR.valueOf(-8), CR.TWO));
  private static final Polynomial<CR> F3NT = RING.create(Arrays.asList(CR.THREE, CR.FOUR));
  private static final Polynomial<CR> F3NU = RING.create(Arrays.asList(CR.ONE, CR.valueOf(-2)));
  private static final Polynomial<CR> F4D = RING.create(Arrays.asList(CR.ONE, CR.valueOf(-4))); // (1-4x)
  private static final Polynomial<CR> F3DV = RING.pow(F4D, 3); // (1-4x)^3
  private int mN = 7;

  // f1:=x->(1-8*x+16*x^2-4*x^3)/(1-4*x)
  private Polynomial<CR> f1(final int n) {
    return RING.series(F1N, F1D, n);
  }

  // f2:=x->(1-6*x+6*x^2)/sqrt(1-4*x)
  private Polynomial<CR> f2(final int n) {
    return RING.series(F2N, RING.sqrt(F1D, n), n);
  }

  // f3:=x->(1/sqrt(2))*(sqrt(2+sqrt(3+4*x))*(3-8*x+2*x^2-sqrt(3+4*x)*(1-2*x)))/(1-4*x)^(3/4)
  private Polynomial<CR> f3(final int n) {
    final Polynomial<CR> s = RING.sqrt(F3NT, n);
    final Polynomial<CR> t = RING.sqrt(RING.add(TWO, s), n);
    final Polynomial<CR> u = RING.subtract(F3N, RING.multiply(s, F3NU, n));
    final Polynomial<CR> v = RING.sqrt(RING.sqrt(F3DV, n), n);
    return RING.divide(RING.series(RING.multiply(t, u), v, n), CR.SQRT2);
  }

  // f4:=x->(1/sqrt(2))*((3-8*x+2*x^2+sqrt(3+4*x)*(1-2*x)))/(1-4*x)^(1/4)/sqrt(2+sqrt(3+4*x))
  private Polynomial<CR> f4(final int n) {
    final Polynomial<CR> s = RING.sqrt(F3NT, n);
    final Polynomial<CR> t = RING.add(F3N, RING.multiply(s, F3NU, n));
    final Polynomial<CR> u = RING.sqrt(RING.sqrt(F4D, n), n); // (1-4x)^(1/4)
    final Polynomial<CR> v = RING.sqrt(RING.add(TWO, s), n);
    return RING.divide(RING.series(t, RING.multiply(u, v, n), n), CR.SQRT2);
  }

  // g:=x->-(1/4)*(f1(x)-f2(x)+f3(x)-f4(x));
  @Override
  public Z next() {
    ++mN;
//    System.out.println(f1(mN));
//    System.out.println(f2(mN));
//    System.out.println(f3(mN));
//    System.out.println(f4(mN));
//    System.out.println("Coeff: " + f1(mN).coeff(mN).subtract(f2(mN).coeff(mN)).add(f3(mN).coeff(mN)).subtract(f4(mN).coeff(mN)));
    return f1(mN).coeff(mN).subtract(f2(mN).coeff(mN)).add(f3(mN).coeff(mN)).subtract(f4(mN).coeff(mN)).assumeInt().toZ().divide(4).negate();
  }
}

