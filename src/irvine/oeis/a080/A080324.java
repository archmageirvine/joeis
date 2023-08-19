package irvine.oeis.a080;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080324 Union of even squarefree numbers (A001747) and squarefree numbers for which the number of prime factors is even (A030229).
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
