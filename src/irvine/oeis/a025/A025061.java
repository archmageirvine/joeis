package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025061 Positions of primes in A025060 (numbers of form j*k + k*i + i*j, where 1 &lt;=i &lt; j &lt; k).
 * @author Sean A. Irvine
 */
public class A025061 extends A025060 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
