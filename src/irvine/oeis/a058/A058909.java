package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A058909 Integers whose set of prime factors (taken with multiplicity) uses each digit exactly once (i.e., is pandigital) in base 10.
 * @author Sean A. Irvine
 */
public class A058909 extends A058760 {

  /** Construct the sequence. */
  public A058909() {
    super(1);
  }

  private long mN = 15618089;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (!fs.isSquareFree()) {
      return false;
    }
    final long[] p = ZUtils.toLong(fs.toZArray());
    return is(p, 10);
  }

  @Override
  public Z next() {
    if (mN == 8439563243L) {
      return null;
    }
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
