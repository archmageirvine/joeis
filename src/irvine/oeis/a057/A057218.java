package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057218 a(n) = least prime of the form n*k! + 1.
 * @author Sean A. Irvine
 */
public class A057218 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z f = Z.valueOf(++mN);
    long k = 1;
    while (true) {
      final Z t = f.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
      f = f.multiply(++k);
    }
  }
}
