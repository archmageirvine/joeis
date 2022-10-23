package irvine.oeis.a058;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058213 Triangular arrangement of solutions of phi(x) = 2^n (n &gt;= 0), where phi=A000010 is Euler's totient function. Each row corresponds to a particular n and its length is n+2 for 0 &lt;= n &lt;= 31, 32 for n &gt;= 32. (This assumes that there are only 5 Fermat primes.).
 * @author Sean A. Irvine
 */
public class A058213 extends Sequence0 {

  private Z mN = Z.ONE;
  private TreeSet<Z> mA = Euler.inversePhi(mN);

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mN = mN.multiply2();
      mA = Euler.inversePhi(mN);
    }
    return mA.pollFirst();
  }
}

