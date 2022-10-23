package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059677 Numbers n such that 1n1, 3n3, 7n7 and 9n9 are all primes.
 * @author Sean A. Irvine
 */
public class A059677 extends Sequence1 {

  private long mN = 19;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      if (new Z("1" + s + "1").isProbablePrime()
        && new Z("3" + s + "3").isProbablePrime()
        && new Z("7" + s + "7").isProbablePrime()
        && new Z("9" + s + "9").isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
