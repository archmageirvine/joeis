package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A066985 Reflective numbers: k such that the decimal encoding of the prime factorization of k (A067599) is palindromic.
 * @author Sean A. Irvine
 */
public class A066985 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.isPalindrome(new HomePrimeSequence(++mN, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE).skip().next(), 10)) {
        return Z.valueOf(mN);
      }
    }
  }
}
