package irvine.oeis.a080;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080324 Numbers k such that mu(k)^k &gt; 0, where mu(k) is the Moebius function (A008683).
 * @author Georg Fischer
 */
public class A080324 extends Sequence1 {

  private long mK = 0;

  @Override
  public Z next() {
    while (true) {
      final int mb = Mobius.mobius(++mK);
      if (mb != 0) {
        if (mb > 0 || (mK & 1) == 0) {
          return Z.valueOf(mK);
        }
      }
    }
  }
}
