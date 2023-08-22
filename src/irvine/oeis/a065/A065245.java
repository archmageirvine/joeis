package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065245 Positive numbers k such that 2 + Sum_{j = 1..k} j^2 is a prime.
 * @author Sean A. Irvine
 */
public class A065245 extends Sequence1 {

  private Z mS = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      mS = mS.add(n.square());
      if (mS.isProbablePrime()) {
        return n;
      }
    }
  }
}

