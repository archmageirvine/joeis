package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003428.
 * @author Sean A. Irvine
 */
public class A003428 implements Sequence {

//  // todo not right, A_{2,4} does reproduce what is in the paper
//  // but this is still not A003428 ??
//
//  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
//  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.NEG_ONE)); // A_{2,2}
//  //private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.ZERO, Q.NEG_ONE)); // B_{2,2}
//  //private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.NEG_ONE, Q.ZERO, Q.NEG_ONE)); // A_{2,4}
//  private int mN = 0;
//  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    throw new UnsupportedOperationException();
//    ++mN;
//    Polynomial<Q> a = RING.one();
//    for (int k = 1; k <= mN; ++k) {
//      a = RING.add(a, SymmetricGroup.create(k).cycleIndex().apply(mA, mN));
//    }
//    a = RING.multiply(C, a, mN);
//    mA = a;
//    System.out.println("A=" + mA);
//    a = RING.subtract(RING.add(a, RING.multiply(a.substitutePower(2, mN), Q.HALF)),
//      RING.multiply(RING.pow(a, 2, mN), Q.HALF));
//    System.out.println("a=" + a);
//    return a.coeff(mN).toZ();
  }
}
