package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007811.
 * @author Sean A. Irvine
 */
public class A007811 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TEN.multiply(++mN);
      if (t.add(1).isProbablePrime() && t.add(3).isProbablePrime() && t.add(7).isProbablePrime() && t.add(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
