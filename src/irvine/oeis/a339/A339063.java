package irvine.oeis.a339;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a052.A052107;

/**
 * A339063 Number of unlabeled simple graphs with n edges rooted at two noninterchangeable vertices.
 * @author Sean A. Irvine
 */
public class A339063 extends A052107 {

  // After Andrew Howroyd

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final int[] PREFIX = {1, 1};
  private int mM = -1;

  private Polynomial<Z> edgesPoly(final int[] v, final int degreeLimit) {
    Polynomial<Z> prod = RING.one();
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = IntegerUtils.gcd(v[i], v[j]);
        final Polynomial<Z> t = RING.pow(RING.onePlusXToTheN(v[i] * v[j] / g), g, degreeLimit);
        prod = RING.multiply(prod, t);
      }
    }
    for (final int c : v) {
      Polynomial<Z> t = RING.pow(RING.onePlusXToTheN(c), (c - 1) / 2, degreeLimit);
      if ((c & 1) == 0) {
        t = RING.multiply(t, RING.onePlusXToTheN(c / 2), degreeLimit);
      }
      prod = RING.multiply(prod, t, degreeLimit);
    }
    return prod;
  }

  private Polynomial<Z> g(final int n, final int[] prefix, final int degreeLimit) {
    Polynomial<Z> sum = RING.zero();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      final int[] q = Arrays.copyOf(prefix, p.length + prefix.length);
      System.arraycopy(p, 0, q, prefix.length, p.length);
      final Polynomial<Z> t = RING.multiply(edgesPoly(q, degreeLimit), IntegerPartition.permCount(p, 1));
      sum = RING.add(sum, t);
    }
    return RING.divide(sum, mF.factorial(n));
  }

  protected int[] getPrefix() {
    return PREFIX;
  }

  @Override
  public Z next() {
    if (++mM == 0) {
      return Z.ONE;
    }
    final Polynomial<Z> sum = g(2 * mM, getPrefix(), mM);
    return sum.coeff(mM);
  }
}
