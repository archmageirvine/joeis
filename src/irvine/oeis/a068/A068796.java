package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068796 Maximum k such that k consecutive integers starting at n have distinct numbers of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A068796 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> seen = new HashSet<>();
    long k = mN;
    while (seen.add(Functions.BIG_OMEGA.l(k++))) {
      // do nothing
    }
    return Z.valueOf(seen.size());
  }
}
