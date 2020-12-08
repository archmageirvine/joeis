package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037082 Primes of the form n!!! + 1.
 * @author Sean A. Irvine
 */
public class A037082 implements Sequence {

  private final Z[] mA = new Z[3];
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int r = (int) (++mN % 3);
      mA[r] = mA[r] == null ? Z.valueOf(mN) : mA[r].multiply(mN);
      final Z t = mA[r].add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
