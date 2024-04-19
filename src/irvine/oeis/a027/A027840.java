package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a060.A060240;

/**
 * A027840 Number of subgroups of index n in fundamental group of a certain fiber space.
 * @author Sean A. Irvine
 */
public class A027840 extends A060240 {

  /** Construct the sequence. */
  public A027840() {
    super(1);
  }

  private int mN = 0;

  private final MemoryFunction2<Integer, Z> mBeta = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer k, final Integer e) {
      if (k == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final IntegerPartition partition = new IntegerPartition(k);
      int[] p;
      while ((p = partition.next()) != null) {
        sum = sum.add(Functions.FACTORIAL.z(k).divide(degree(k, p)).pow(e));
      }
      return sum;
    }
  };

  private Z bigR(final int n, final int e) {
    Z sum = Z.ZERO;
    final IntegerPartition partition = new IntegerPartition(n);
    int[] p;
    final int[] cnt = new int[n + 1];
    while ((p = partition.next()) != null) {
      IntegerPartition.toCountForm(p, cnt);
      Z b = Z.ONE;
      for (final int i : p) {
        b = b.multiply(mBeta.get(i, e));
      }
      b = b.multiply(n).multiply(Binomial.multinomial(p.length, cnt)).divide(p.length);
      sum = sum.signedAdd((p.length & 1) == 1, b);
    }
    return sum;
  }

  protected int nu() {
    return 2;
  }

  @Override
  public Z next() {
    return bigR(++mN, nu());
  }
}
