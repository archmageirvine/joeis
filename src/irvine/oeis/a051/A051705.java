package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A051705 Numbers whose Japanese name lacks syllable "ku".
 * @author Sean A. Irvine
 */
public class A051705 extends Sequence1 implements Conjectural {

  // Rules here were inferred for existing values

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 == 9) {
        continue;
      }
      if (String.valueOf(mN).contains("6")) {
        continue;
      }
      return Z.valueOf(mN);
    }
  }
}
