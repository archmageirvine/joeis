package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A052371 Triangle T(n,k) of n X n binary matrices with k=0...n^2 ones up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A052371 extends A052107 {

  /** Construct the sequence. */
  public A052371() {
    super(0);
  }

  // After Andrew Howroyd

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Polynomial<Q> mRow = RING.zero();
  private int mN = -1;
  private int mM = 0;

  private Polynomial<Q> c(final int[] p, final int[] q) {
    Polynomial<Q> prod = RING.one();
    for (final int j : q) {
      for (final int i : p) {
        final Polynomial<Q> f = RING.pow(RING.onePlusXToTheN(IntegerUtils.lcm(i, j)), IntegerUtils.gcd(i, j));
        prod = RING.multiply(prod, f);
      }
    }
    return prod;
  }

  /*
  c(p, q)={prod(i=1, #p, prod(j=1, #q, (1 + x^lcm(p[i], q[j]))^gcd(p[i], q[j])))}

row(n)={my(s=0); forpart(p=n, forpart(q=n, s+=permcount(p) * permcount(q) * c(p, q))); Vec(s/(n!^2))}

for(n=1, 5, print(row(n)))
   */

  protected Polynomial<Q> row(final int n) {
    Polynomial<Q> sum = RING.zero();
    final IntegerPartition part = new IntegerPartition(n);
    int[] q;
    while ((q = part.next()) != null) {
      final Z pcq = IntegerPartition.permCount(q, 1);
      final IntegerPartition part2 = new IntegerPartition(n);
      int[] p;
      while ((p = part2.next()) != null) {
        sum = RING.add(sum, RING.multiply(c(p, q), new Q(IntegerPartition.permCount(p, 1).multiply(pcq))));
      }
    }
    return RING.multiply(sum, new Q(Z.ONE, mF.factorial(n).square()));
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mRow = row(mN);
      mM = 0;
    }
    return mRow.coeff(mM).toZ();
  }
}
