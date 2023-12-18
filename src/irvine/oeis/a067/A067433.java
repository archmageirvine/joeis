package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067433 Triangle in which row n gives trajectory of n under the map k -&gt; k/3 if k is divisible by 3, otherwise k -&gt; next multiple of 3, stopping when reaching 1 (the initial term n is not included).
 * @author Sean A. Irvine
 */
public class A067433 extends Sequence1 {

  private long mN = 1;
  private long mM = 3;

  private long step(final long n) {
    return n % 3 == 0 ? n / 3 : 3 * ((n + 2) / 3);
  }

  @Override
  public Z next() {
    if (mM == 1) {
      mM = step(++mN);
    } else {
      mM = step(mM);
    }
    return Z.valueOf(mM);
  }
}
