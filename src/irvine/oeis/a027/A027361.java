package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027361 Number of "sorted permutations": permutations that can occur as the output of the sorting procedure described by Knuth.
 * @author Sean A. Irvine
 */
public class A027361 implements Sequence {

  // I cannot reproduce the terms of this sequence.  The equations in the Bousquet-Melou
  // paper appear to reproduce other sequences which can be themselves reproduced by
  // simpler means.

//
//  private static final PolynomialRingField<Q> RAT = new PolynomialRingField<>(Rationals.SINGLETON);
//  private static final RationalFunctionField<Q> INNER = new RationalFunctionField<>("y", Rationals.SINGLETON);
//  private static final PolynomialRingField<RationalFunction<Q>> OUTER = new PolynomialRingField<>(INNER);
//  private static final Polynomial<RationalFunction<Q>> C = OUTER.create(Collections.singletonList(new RationalFunction<>(RAT.one(), RAT.oneMinusXToTheN(1))));
//  private static final Polynomial<RationalFunction<Q>> D = OUTER.create(Arrays.asList(INNER.zero(), new RationalFunction<>(RAT.oneMinusXToTheN(1), RAT.one())));
//  private Polynomial<RationalFunction<Q>> mB = OUTER.one();
//  private int mN = -1;
//
//  // B(x,0)
//  private Polynomial<RationalFunction<Q>> eval0(final Polynomial<RationalFunction<Q>> a) {
//    final Polynomial<RationalFunction<Q>> res = OUTER.create(Collections.emptyList());
//    for (final RationalFunction<Q> r : a) {
//      final Q c = RAT.coeff(r.left(), r.right(), 0);
//      res.add(new RationalFunction<>(RAT.create(Collections.singletonList(c)), RAT.one()));
//    }
//    System.out.println(a + " eval(x,0) -> " + res);
//    return res;
//  }
//
//  @Override
//  public Z next() {
//    final Polynomial<RationalFunction<Q>> b0 = eval0(mB);
//    final Polynomial<RationalFunction<Q>> b1 = OUTER.divide(OUTER.subtract(mB, b0), INNER.x());
//    //final Polynomial<RationalFunction<Q>> b2 = OUTER.add(OUTER.multiply(mB, D), OUTER.one()).shift(1);
//    final Polynomial<RationalFunction<Q>> b2 = OUTER.add(OUTER.multiply(mB, INNER.x()), OUTER.one()).shift(1);
//    mB = OUTER.add(OUTER.multiply(b1, b2), C);
//    System.out.println("mB_" + (mN + 1) + "(x,y) = " + mB);
//    final RationalFunction<Q> c = mB.coeff(++mN);
//    System.out.println("c=" + c);
//    final Polynomial<Q> s = RAT.series(c.left(), c.right(), 10);
//    System.out.println("yields: " + s);
//    if (mN > 0) {
//      final RationalFunction<Q> c0 = mB.coeff(mN - 1);
//      System.out.println("prev=" + RAT.series(c0.left(), c0.right(), 10));
//    }
//    System.out.println("0-spec: " + eval0(mB));
//    return s.coeff(0).toZ();
//  }


  @Override
  public Z next() {
    throw new UnsupportedOperationException();
  }
}
