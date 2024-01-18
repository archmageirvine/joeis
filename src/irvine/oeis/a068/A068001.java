package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068001.
 * @author Sean A. Irvine
 */
public class A068001 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    Z k = Z.ONE;
    while (true) {
      Z t = k.pow(mN);
      while (t.compareTo(n) > 0) {
        t = t.divide(10);
      }
      if (t.equals(n)) {
        return k;
      }
      k = k.add(1);
    }
  }
}
