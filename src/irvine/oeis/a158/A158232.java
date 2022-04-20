package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A158232 Numbers which yield primes when "13" is prefixed or appended: N natural number is a member of the sequence, if P="13N" (prefixed 13) and A="N13" (appended 13) are prime.
 * @author Georg Fischer
 */
public class A158232 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String nstr = String.valueOf(++mN);
      if (new Z("13" + nstr).isPrime() && new Z(nstr + "13").isPrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
