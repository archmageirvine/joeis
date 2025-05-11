package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077218 extends Sequence1 {

  private long mP = 1;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.l(mP);
    final long q = Functions.NEXT_PRIME.l(mP);
    long res = 0;
    for (long c = mP + 1; c < q; ++c) {
      res += Functions.BIG_OMEGA.l(c);
    }
    return Z.valueOf(res);
  }
}

