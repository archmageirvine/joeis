package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061074 Smallest number that begins with 1, has digits in order 123...901... and is divisible by n. If no such number exists then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A061074 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long a = 0;
    Z p = Z.ZERO;
    while (true) {
      if (++a > 9) {
        a = 0;
      }
      p = p.multiply(10).add(a);
      System.out.println(mN + " mod = " + p.mod(mN));
      if (p.mod(mN) == 0) {
        return p;
      }
      if (p.bitLength() > 10000) { // todo this is bogus! Pollard cycle detection style thing?
        return Z.ZERO;
      }
    }
  }
}
