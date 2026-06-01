package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394866 a(1) = 1; for n &gt; 1, a(n) is the number of integers m in [2^(n-1)..3^(n-1) - 1] such that A000005(m) = n.
 * @author Sean A. Irvine
 */
public class A394866 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    if (Predicates.PRIME.is(mN)) {
      return Z.ONE;
    }
    long cnt = 1; // 3^n-1 is always a solution
    final Z end = Z.THREE.pow(mN - 1);
    for (Z k = Z.ONE.shiftLeft(mN - 1).add(1); !k.equals(end); k = k.add(1)) {
      if (Functions.SIGMA0.l(k) == mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

