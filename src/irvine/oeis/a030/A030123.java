package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030123 Most likely total for a roll of n 6-sided dice, choosing the smallest if there is a choice.
 * @author Sean A. Irvine
 */
public class A030123 extends Sequence0 {

  private long mN = -7;

  @Override
  public Z next() {
    mN += 7;
    if (mN <= 7) {
      return Z.valueOf(mN / 7);
    }
    return Z.valueOf(mN / 2);
  }
}

