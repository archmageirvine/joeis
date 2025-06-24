package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078242 Smallest multiple of n using only digits 0 and 3.
 * @author Sean A. Irvine
 */
public class A078242 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z t = new Z(Long.toBinaryString(++k)).multiply(3);
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}

