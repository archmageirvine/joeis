package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.MemoryFunction;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A005489 Number of nonzero coefficients of order n in Baker-Campbell-Hausdorff expansion.
 * @author Sean A. Irvine
 */
public class A005489 extends MemoryFunction<Integer, Polynomial<Q>> implements Sequence {

  // After Andrey Zabolotskiy

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.NEG_ONE, Q.TWO));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, Q.ONE));
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 1;

  @Override
  protected Polynomial<Q> compute(final Integer s) {
    if (s == 1) {
      return RING.one();
    }
    return RING.add(
      RING.multiply(getValue(s - 1), C1),
      RING.multiply(C2, RING.diff(getValue(s - 1)))
    );
  }

  private Q cx(final int[] ss) {
    final int m = ss.length;
    final int mp = m / 2;
    final int mpp = (m - 1) / 2;
    Polynomial<Q> gamma = RING.one();
    for (final int s : ss) {
      gamma = RING.multiply(gamma, getValue(s));
    }
    int lim = 0;
    for (final int s : ss) {
      lim += s;
    }
    lim -= m - 2;
    Q sum = Q.ZERO;
    //System.out.println("gamma=" + gamma);
    //for (int k = 0; k < gamma.size(); ++k) {
    for (int k = 1; k <= lim; ++k) {
      sum = sum.add(gamma.coeff(k - 1).multiply(mF.factorial(mp + k - 1)).divide(mF.factorial(m + k - 1)));
    }
    Q multiplier = new Q(mF.factorial(mpp));
    for (final int s : ss) {
      multiplier = multiplier.divide(mF.factorial(s));
    }
    final Q sm = sum.multiply(multiplier);
    return (mpp & 1) == 0 ? sm : sm.negate();
  }

  private long per(final int n, final int[] p) {
//    final int[] c = new int[n + 1];
//    IntegerPartition.toCountForm(p, c);
//    return Binomial.multinomial(n - 1, c).longValueExact();
//    return mF.factorial(n - 1).divide(SymmetricGroup.per(c));
//    return IntegerPartition.ord(c);
    final Permutation perm = new Permutation(p);
    long c = 0;
    while (perm.next() != null) {
      ++c;
    }
    return c;
  }

  private Z cxs(final int n) {
    final IntegerPartition part = new IntegerPartition(n - 1);
    int[] p;
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      final Q cx = cx(p);
      if (!Q.ZERO.equals(cx)) {
        System.out.println(Arrays.toString(p) + " " + cx.reciprocal() + " " + per(n, p));
        sum = sum.add(per(n, p));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    final Z s = cxs(++mN);
    System.out.println("CXS: " + s);
    return s.add(1).divide2();
  }
}

/*
g[1] = 1;
g[s_] := g[s] = Expand[(2 t - 1) g[s - 1] + t (t - 1) D[g[s - 1], t]];

cx[ss_] := Module[{m, mp, mpp, \[Gamma]},
   m = Length[ss] + 1;
   mp = Floor[m/2];
   mpp = Floor[(m - 1)/2];
   \[Gamma] = CoefficientList[Product[g[s], {s, ss}], t];
   (-1)^mpp mpp! / Product[s!, {s, ss}] Sum[\[Gamma][[k]] (mp + k - 1)!/(m + k - 1)!, {k, Total[ss] - m + 2}]
];

cxs[n_] := Select[Table[{cx[ss], Length@Permutations@ss}, {ss, IntegerPartitions[n - 1]}], First@# != 0 &];
a[n_] := Total[Last /@ cxs[n]];
Table[a[n], {n, 10}]
 */
