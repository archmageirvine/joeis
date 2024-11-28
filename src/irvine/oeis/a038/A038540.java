package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.dirichlet.FiniteDs;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038540 a(n) = number of modules with n elements over the ring of integers in the real quadratic field of discriminant 40.
 * @author Sean A. Irvine
 */
public class A038540 extends Sequence1 {

  private final long mD;
  private int mN = 0;

  protected A038540(final long d) {
    mD = d;
  }

  /** Construct the sequence. */
  public A038540() {
    this(40);
  }

  @Override
  public Z next() {
    ++mN;
    final FiniteDs ds1 = Dgf.empty();
    final FiniteDs ds2 = Dgf.empty();
    for (int k = 1; k <= mN; ++k) {
      ds1.put(Z.valueOf(k), Z.ONE);
      final int kronecker = Functions.KRONECKER.i(mD, k);
      if (kronecker != 0) {
        ds2.put(Z.valueOf(k), Z.valueOf(kronecker));
      }
    }
    Ds v = Dgf.multiply(ds1, ds2);
    final Ds bigZ = v;
    for (int j = 2; j <= LongUtils.log2(mN); ++j) {
      final FiniteDs u = Dgf.empty();
      for (Z k = Z.ONE; k.compareTo(Z.valueOf(mN).root(j)) <= 0; k = k.add(1)) {
        u.put(k.pow(j), bigZ.coeff(k));
      }
      v = Dgf.multiply(v, u);
    }
    return v.coeff(mN);
  }
}
