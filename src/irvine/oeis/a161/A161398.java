package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A161398.
 * @author Sean A. Irvine
 */
public class A161398 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final long pc = PopCount.popcount(++mN);
    if (pc == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    final Z[] d = fs.divisors();
    Arrays.sort(d);
    for (final Z dd : d) {
      if (dd.bitCount() == pc) {
        return dd;
      }
    }
    return null;
  }
}

