package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A069822 Numbers n for which there is at least one x &lt; n such that sigma(x) = sigma(n).
 * @author Sean A. Irvine
 */
public class A069822 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Functions.SIGMA.l(++mN);
      if (mSeen.isSet(sigma)) {
        return Z.valueOf(mN);
      }
      mSeen.set(sigma);
    }
  }
}

