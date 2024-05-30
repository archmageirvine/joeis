package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061498 Number of distinct terms in the first difference sequence of reduced residue system[=dRRS] for n.
 * @author Sean A. Irvine
 */
public class A061498 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> set = new HashSet<>();
    long a = 1;
    for (long k = 2; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        set.add(k - a);
        a = k;
      }
    }
    return Z.valueOf(set.size());
  }
}

