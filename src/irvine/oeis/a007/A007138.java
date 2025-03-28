package irvine.oeis.a007;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007138 Smallest primitive factor of 10^n - 1. Also smallest prime p such that 1/p has repeating decimal expansion of period n.
 * @author Sean A. Irvine
 */
public class A007138 extends Sequence1 {

  private final HashSet<Z> mS = new HashSet<>();
  private final long mBase;
  private Z mN = Z.ONE;

  protected A007138(final long base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A007138() {
    this(10);
  }

  @Override
  public Z next() {
    mN = mN.multiply(mBase);
    final FactorSequence fs = Jaguar.factor(mN.subtract(1));
    Z res = null;
    for (final Z p : fs.toZArray()) {
      final boolean isNew = mS.add(p);
      if (isNew && res == null) {
        res = p;
      }
    }
    return res == null ? Z.ONE : res;
  }
}
