package irvine.oeis.a388;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A388849 Number of polynomials P in the set S such that P(1)=n, where S is defined by: (i) 1 is in S; (ii) P is in S implies 1+x*P is in S; (iii) P is in S and Q is in S implies P*Q is in S.
 * @author Sean A. Irvine
 */
public class A388849 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  // mSet[n] holds polynomials such that p(1)=n
  private final DynamicArray<Set<Polynomial<Z>>> mSets = new DynamicArray<>();
  {
    mSets.set(1, Collections.singleton(Polynomial.create(1)));
  }
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mSets.get(mN) == null) {
        mSets.set(mN, new HashSet<>());
      }
      final Set<Polynomial<Z>> set = mSets.get(mN);
      // Handle rule (ii) p in S, implies 1 + x*p in S
      // Note if p(1)=k, then 1+x*p evaluated at 1 is k+1
      for (final Polynomial<Z> p : mSets.get(mN - 1)) {
        final Polynomial<Z> r = RING.empty(); // 1 + x*p (efficiently)
        r.add(Z.ONE);
        r.addAll(p);
        set.add(r);
      }
      // Handle rule (iii), p,q in S, implies p*q in S
      // If p(1)=k and q(1)=j, then (pq)(1) = k * j
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        if (2 * d <= mN) { // Avoid symmetry
          for (final Polynomial<Z> p : mSets.get(d)) {
            for (final Polynomial<Z> q : mSets.get(mN / d)) {
              final Polynomial<Z> r = RING.multiply(p, q);
              set.add(r);
            }
          }
        }
      }
    }
    return Z.valueOf(mSets.get(mN).size());
  }
}

