package irvine.oeis.a005;

import java.io.IOException;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005142.
 * @author Sean A. Irvine
 */
public class A005142 implements Sequence {

  // I've tried to implement this from two different papers.  They two functions
  // agree, but don't produce the expected sequence.  I emailed the author of the
  // SAGE version and he said he would look into it but never got back to me.

//  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
//
//  private Polynomial<Q> fxX(final int n) {
//    // This could be made faster by caching the cycle indexes and just adding terms in an array
//    Polynomial<Q> sum = RING.zero();
//    for (int m = 1; m <= n; ++m) {
//      final CycleIndex cm = SymmetricGroup.create(m).cycleIndex();
//      for (int r = 1; m + r <= n; ++r) {
//        final CycleIndex cr = SymmetricGroup.create(r).cycleIndex();
//        final CycleIndex c = cm.op(HararyMultiply.OP, cr);
//        final Polynomial<Q> coeff = c.apply(RING.monomial(Q.TWO, 1), n);
//        mSum = RING.add(mSum, coeff);
//      }
//    }
//    return RING.multiply(sum, Q.HALF);
//  }
//
//  private Polynomial<Q> fyX(final int n) {
//    Polynomial<Q> sum = RING.zero();
//    for (int k = 1; k <= n; ++k) {
//      final CycleIndex c = BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(k);
//      mSum = RING.add(mSum, c.apply(RING.monomial(Q.TWO, 1), n));
//    }
//    return RING.multiply(sum, Q.HALF);
//  }
//
//  private Polynomial<Q> fx(final int n) {
//    // This could be made faster by caching the cycle indexes and just adding terms in an array
//    Polynomial<Q> sum = RING.zero();
//    for (int m = 1; m <= n; ++m) {
//      final CycleIndex cm = SymmetricGroup.create(m).cycleIndex();
//      for (int r = 1; r <= n; ++r) {
//        final CycleIndex cr = SymmetricGroup.create(r).cycleIndex();
//        final CycleIndex c = cm.op(HararyMultiply.OP, cr);
//        mSum = RING.add(mSum, RING.monomial(c.apply(1), m + r));
//      }
//    }
//    return RING.multiply(sum, Q.ONE);
//  }
//
//  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
//
//  private static Z period(final int[] j) {
//    Z d = Z.ONE;
//    for (int i = 0; i < j.length; ++i) {
//      if (j[i] > 0) {
//        d = d.multiply(FACTORIAL.factorial(j[i]).multiply(Z.valueOf(i).pow(j[i])));
//      }
//    }
//    return d;
//  }
//
//  private int[] q(final int[] j) {
//    final int[] q = new int[j.length];
//    for (int k = 0; k < j.length; ++k) {
//      q[k] = 2 * j[k];
//    }
//    return q;
//  }
//
//  private int l(final int[] j) {
//    int c = 0;
//    for (final int k : j) {
//      if (k > 0) {
//        c++;
//      }
//    }
//    return c;
//  }
//
//  private Q cycleFt(final int n) {
//    Q sum = Q.ZERO;
//    final IntegerPartition part = new IntegerPartition(n / 2);
//    int[] p;
//    final int[] j = new int[n + 1];
//    while ((p = part.next()) != null) {
//      int c = fixed(p); // !!!
//      //System.out.println(Z.ONE.shiftLeft(c) + " " + n + " " + Arrays.toString(p));
//      IntegerPartition.toCountForm(q(p), j);
//      mSum = mSum.add(new Q(Z.ONE.shiftLeft(c), period(j)));
//    }
//    return sum;
//  }
//
//  private int fixed(final int[] j) {
//    int c = l(j);
//    for (final int v : j) {
//      c += (v + 1) / 2;
//    }
//    for (int k = 0; k < j.length; ++k) {
//      if (j[k] != 0) {
//        for (int i = k + 1; i < j.length; ++i) {
//          if (j[i] != 0) {
//            c += IntegerUtils.gcd(j[k], j[i]);
//          }
//        }
//      }
//    }
//    return c;
//  }
//
//  private int count(final int[] mu, final int[] nu) {
//    int c = 0;
//    for (final int k : mu) {
//      if (k > 0) {
//        for (final int j : nu) {
//          if (j > 0) {
//            c += IntegerUtils.gcd(k, j);
//          }
//        }
//      }
//    }
//    return c;
//  }
//
//  private Q cycleFe(final int n) {
//    Q sum = Q.ZERO;
//    for (int mu = 1; mu < n; ++mu) {
//      final int nu = n - mu;
//      final IntegerPartition partMu = new IntegerPartition(mu);
//      int[] pMu;
//      final int[] jMu = new int[mu + 1];
//      while ((pMu = partMu.next()) != null) {
//        IntegerPartition.toCountForm(pMu, jMu);
//        final Z periodMu = period(jMu);
//        final IntegerPartition partNu = new IntegerPartition(nu);
//        int[] pNu;
//        final int[] jNu = new int[nu + 1];
//        while ((pNu = partNu.next()) != null) {
//          IntegerPartition.toCountForm(pNu, jNu);
//          int c = count(pMu, pNu); // !!! Yes note normal partitions
//          mSum = mSum.add(new Q(Z.ONE.shiftLeft(c), period(jNu).multiply(periodMu)));
//        }
//      }
//    }
//    return sum;
//  }
//
//  private Polynomial<Q> ft(final int n) {
//    Polynomial<Q> sum = RING.zero();
//    for (int k = 2; k <= n; k += 2) {
//      mSum = RING.add(mSum, RING.monomial(cycleFt(k), k));
//    }
//    return sum;
//  }
//
//  private Polynomial<Q> fe(final int n) {
//    Polynomial<Q> sum = RING.zero();
//    for (int k = 1; k <= n; ++k) {
//      mSum = RING.add(mSum, RING.monomial(cycleFe(k), k));
//    }
//    return sum;
//  }
//
//  private Polynomial<Q> fy(final int n) {
//    Polynomial<Q> sum = RING.zero();
//    for (int k = 1; 2 * k <= n; ++k) {
//      final CycleIndex c = BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(k);
//      mSum = RING.add(mSum, RING.monomial(c.apply(1), 2 * k));
//    }
//    return RING.multiply(sum, Q.ONE);
//  }
//
//  private Polynomial<Q> gx(final int n) {
//    Polynomial<Q> sum = RING.zero();
//    final Polynomial<Q> fx2 = RING.multiply(fe(n + 2), Q.ONE); // XXX
//    for (int k = 1; k <= n; ++k) {
////      final Polynomial<Q> fx2 = RING.multiply(fe(n + 2).substitutePower(k), Q.ONE); // XXX
////      final Polynomial<Q> logFx2 = RING.log1p(fx2, n);
//      final Polynomial<Q> logFx2 = RING.log1p(fx2, n).substitutePower(k);
//      mSum = RING.add(mSum, RING.multiply(logFx2, new Q(Mobius.mobius(k), k)));
//    }
//    System.out.println("gx=" + sum.toString());
//    return sum;
//  }
//
//  private Polynomial<Q> gy(final int n) {
//    Polynomial<Q> sum = RING.zero();
//    final Polynomial<Q> fy2 = RING.multiply(ft(n + 2), Q.ONE); // XXX
//    for (int k = 0; 2 * k + 1 <= n; ++k) {
////      final Polynomial<Q> fy2 = RING.multiply(ft(n + 2).substitutePower(2 * k + 1), Q.ONE); // XXX
////      final Polynomial<Q> logFy2 = RING.log1p(fy2, n);
//      final Polynomial<Q> logFy2 = RING.log1p(fy2, n).substitutePower(2 * k + 1);
//      mSum = RING.add(mSum, RING.multiply(logFy2, new Q(Mobius.mobius(2 * k + 1), 2 * k + 1)));
//    }
//    final Polynomial<Q> fx2 = RING.multiply(fe(n + 2), Q.ONE); // XXX
//    for (int k = 1; 2 * k <= n; ++k) {
////      final Polynomial<Q> fx2 = RING.multiply(fe(n + 2).substitutePower(2 * k), Q.ONE); // XXX
////      final Polynomial<Q> logFx2 = RING.log1p(fx2, n);
//      final Polynomial<Q> logFx2 = RING.log1p(fx2, n).substitutePower(2 * k);
//      mSum = RING.add(mSum, RING.multiply(logFx2, new Q(Mobius.mobius(2 * k), 2 * k)));
//    }
//    System.out.println("gy=" + sum.toString());
//    return sum;
//  }
//
////  private Polynomial<Q> gyOrig(final int n) {
////    Polynomial<Q> sum = RING.zero();
////    for (int k = 0; 2 * k + 1 <= n; ++k) {
////      final Polynomial<Q> fy2 = RING.multiply(fy(n).substitutePower(2 * k + 1), Q.TWO);
////      Polynomial<Q> logFy2 = RING.log1p(fy2, n);
////      for (int i = 1; 2 * i * (2 * k + 1) <= n; ++i) {
////        final Polynomial<Q> t = RING.multiply(gx(n).substitutePower(2 * i * (2 * k + 1)), new Q(1, 2 * i));
////        logFy2 = RING.subtract(logFy2, t);
////      }
////      mSum = RING.add(mSum, RING.multiply(logFy2, new Q(Mobius.mobius(2 * k + 1), 2 * k + 1)));
////    }
////    System.out.println("gy=" + sum.toString());
////    return sum;
////  }
//
//  private Z g(final int n) {
//    return gx(n).coeff(n).add(gy(n).coeff(n)).toZ();
//  }
//
//  private Z c(final int n) {
//    return g(n).divide2();
//  }
//

  // This nauty implementation works, but is too slow to get bigger terms

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
    gg.sanitizeParams();
    try {
      gg.run(true /* bipartite */, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(gg.totalCount());
  }
}
