package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084429 Integers m such that the base-10 digit concatenation 4//m//3//m//2//m//1 is prime.
 * @author Sean A. Irvine
 */
public class A084429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = new Z("4" + mN + "3" + mN + "2" + mN + "1");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
