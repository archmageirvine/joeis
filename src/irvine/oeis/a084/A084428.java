package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084428 Numbers n such that n 7's followed by n is prime.
 * @author Sean A. Irvine
 */
public class A084428 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mS.append('7');
      final Z t = new Z(mS + String.valueOf(++mN));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
