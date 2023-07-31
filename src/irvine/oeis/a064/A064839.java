package irvine.oeis.a064;

import java.util.HashMap;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064839 List the natural numbers starting a new row only with each new least prime signature (A025487). a(n) is the column position associated with n.
 * @author Sean A. Irvine
 */
public class A064839 extends Sequence1 {

  private final HashMap<Z, Long> mRowCounts = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mRowCounts.merge(FactorUtils.leastPrimeSignature(Z.valueOf(++mN)), 1L, Long::sum));
  }
}
