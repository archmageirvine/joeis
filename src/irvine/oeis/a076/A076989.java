package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076989 Smallest cube of the form n*k + 1 with k&gt;0.
 * @author Sean A. Irvine
 */
public class A076989 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(3);
      if (t.mod(mN) == 1 % mN) {
        return t;
      }
    }
  }
}

