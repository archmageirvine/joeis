package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038562 Let a (resp. b,c,d) be number of primes in the range {2..p} that end in 1 (resp. 3,7,9); sequence gives p such that a=d and b=c.
 * @author Sean A. Irvine
 */
public class A038562 extends A000040 {

  {
    setOffset(2);
  }

  private final long[] mA = new long[10];

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      ++mA[(int) p.mod(10)];
      if (mA[1] == mA[9] && mA[3] == mA[7]) {
        return p;
      }
    }
  }
}
