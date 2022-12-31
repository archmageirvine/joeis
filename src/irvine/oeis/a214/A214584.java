package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A214584 Integers whose decimal representation has only digits in {4,5,7}.
 * @author Georg Fischer
 */
public class A214584 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z result = Z.valueOf(++mN);
      if (result.toString().matches("[457]+")) {
        return result;
      }
    }
  }
}
