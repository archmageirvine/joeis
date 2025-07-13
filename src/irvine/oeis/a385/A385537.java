package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002275;
import irvine.oeis.a007.A007088;
import irvine.util.string.StringUtils;

/**
 * A385537 Indices k such that the repunit (10^k-1)/9 is coprime with any other nonzero binary vector of the same length in base 10.
 * @author Sean A. Irvine
 */
public class A385537 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mR = new A002275();
  private long mN = -1;

  private boolean is(final Z repunit) {
    if (repunit.isProbablePrime()) {
      return true;
    }
    final Sequence bin = new A007088().skip(2);
    while (true) {
      final Z t = bin.next();
      if (t.compareTo(repunit) >= 0) {
        return true;
      }
      if (!Functions.GCD.z(repunit, t).isOne()) {
        return false;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z repunit = mR.next();
      if (++mN <= 3 || is(repunit)) {
        return Z.valueOf(mN);
      }
      if (mVerbose) {
        StringUtils.message("Completed check for " + mN);
      }
    }
  }
}

