package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A000688 Number of Abelian groups of order n; number of factorizations of n into prime powers.
 * @author Sean A. Irvine
 */
public class A000688 extends Sequence1 implements DirectSequence {

  private long mN = 0;
  private final ArrayList<Z> mPart = new ArrayList<>();
  private final A000041 mP = new A000041();

  protected Z p(final int n) {
    while (n >= mPart.size()) {
      mPart.add(mP.next());
    }
    return mPart.get(n);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      r = r.multiply(p(fs.getExponent(p)));
    }
    return r;
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      r = r.multiply(Functions.PARTITIONS.z(fs.getExponent(p)));
    }
    return r;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
