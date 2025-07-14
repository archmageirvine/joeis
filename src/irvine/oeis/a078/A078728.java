package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078728 a(n) is the smallest m such that m &lt; 10^n, 10^n + m is prime and if the natural number k is such that 1 &lt; k &lt; 10 and 3 doesn't divide k*10^n + m then k*10^n+m is prime.
 * @author Sean A. Irvine
 */
public class A078728 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    long m = 0;
    while (mT.compareTo(++m) > 0) {
      if (mT.add(m).isProbablePrime()
        && mT.multiply(m % 3 + 2).add(m).isProbablePrime()
        && mT.multiply(4).add(m).isProbablePrime()
        && mT.multiply(m % 3 + 5).add(m).isProbablePrime()
        && mT.multiply(7).add(m).isProbablePrime()
        && mT.multiply(m % 3 + 8).add(m).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
    throw new RuntimeException();
  }
}
