package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005946 Number of n-step mappings with 5 inputs.
 * @author Sean A. Irvine
 */
public class A005946 extends MemoryFunction2<Integer, Z> implements Sequence {

  protected static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  protected int mN = 0;

  protected static Z per(final int[] a) {
    Z c = Z.ONE;
    for (int i = 1; i < a.length; ++i) {
      c = c.multiply(FACTORIAL.factorial(a[i])).multiply(FACTORIAL.factorial(i).pow(a[i]));
    }
    return c;
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 1 || n == 1) {
      return Z.ONE;
    }
    if (n == 2) {
      return Z.valueOf(m);
    }
    // Eqn (16) Hogg & Huberman
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(n);
    final int[] lambda = new int[n + 1];
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, lambda);
      Z t = Z.ONE;
      for (int k = 1; k < lambda.length; ++k) {
        t = t.multiply(get(k, m - 1).pow(lambda[k]));
      }
      t = t.multiply(FACTORIAL.factorial(n));
      t = t.divide(per(lambda));
      sum = sum.add(t);
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(5, ++mN);
  }
}
